package controllers;

import dao.EmployeeDAO;
import dao.ExpenseDAO;
import dao.ProjectDAO;
import dao.WorkDAO;
import io.ebean.DB;
import io.ebean.Expr;
import model.Employee;
import model.Expense;
import model.Project;
import model.Work;
import utils.ApplicationException;

import java.util.Date;
import java.util.List;

public class ProjectController {

    WorkDAO workDAO = new WorkDAO();
    ExpenseDAO expenseDAO = new ExpenseDAO();
    ProjectDAO projectDAO = new ProjectDAO();
    EmployeeDAO employeeDAO = new EmployeeDAO();

    public void endProject(Integer projectId) throws ApplicationException {
        if (projectId == null) {
            throw (new ApplicationException("Projektinumeroa ei ole annettu."));
        }
        Project project = projectDAO.getProject(projectId);
        if (project == null) {
            throw (new ApplicationException("Projektia ei ole"));
        }
        if (project.getState().equals(Project.ENDED)) {
            throw (new ApplicationException("Projekti on päättynyt"));
        }
        List<Work> works = workDAO.getWorkForProject(projectId);
        for (Work work : works) {
            List<Expense> kustannukset = expenseDAO.getWorkExpenses(work);
            for (Expense expense : kustannukset) {
                if (expense.getState().equals(Expense.OPEN)) {
                    throw (new ApplicationException("Et voi sulkea projektia, kaikkia kustannuksia ei ole maksettu!"));
                }
            }
        }
        project.setEnds(new Date());
        project.setState(Project.ENDED);
        projectDAO.updateProject(project);
    }

    public void addProjectManager(Integer tunnus, Integer henkilonro) throws ApplicationException {
        if (tunnus == null || henkilonro == null) {
            throw (new ApplicationException("Projektitunnus ja henkilönro on annettava"));
        }
        Project project = projectDAO.getProject(tunnus);
        if (project ==null){
            throw (new ApplicationException("Projektia ei löydy"));
        }
        Employee employee = employeeDAO.getEmployee(henkilonro);
        if (employee ==null){
            throw (new ApplicationException("Tuontekijaa ei löydy"));
        }
        if (employee.getTitle().equals(Employee.PROJECTMANAGER)){
           project.setProjectManager(employee);
           projectDAO.updateProject(project);
        }
    }

    public List<Project> listProjects() {
        return projectDAO.listProjects();
    }

    public Project getProject(Integer projectId) {
       return projectDAO.getProject(projectId);
    }

    public void updateProject(Project currentProject) throws ApplicationException {
        projectDAO.updateProject(currentProject);
    }


    public void addProject(Project project) {
        project.save();
    }
}
