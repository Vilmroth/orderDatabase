package controllers;

import dao.EmployeeDAO;
import dao.ProjectDAO;
import dao.ProjectEmployeeDAO;
import model.Employee;
import model.Project;
import model.ProjectEmployee;
import utils.ApplicationException;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Date;
import java.util.List;

public class EmployeeController {

    EmployeeDAO employeeDAO = new EmployeeDAO();
    ProjectDAO projectDAO = new ProjectDAO();
    ProjectEmployeeDAO projectEmployeeDAO = new ProjectEmployeeDAO();

    public Employee addEmployee(Employee employee) throws ApplicationException {
        try {
            //Jos kutsumme dao-funktiota try-catchin sisällä (kuten tässä), voimme jättää dao-funktion
            //ilman poikkeusta (nyt myös addEmployee-dao-funktio antaa ApplicationException -poikkeuksen)
            return employeeDAO.addEmployee(employee);
        } catch (Exception e) {
            throw (new ApplicationException("Adding employee failed. " + e.getMessage(), e));
        }
    }

    public Employee updateEmployee(Employee employee) throws ApplicationException {
        try {
            return employeeDAO.updateEmployee(employee);
        } catch (Exception e) {
            throw (new ApplicationException("Updating employee failed.", e));
        }
    }

    public Employee getEmployee(Integer employeeId) throws ApplicationException {
        try {
            return employeeDAO.getEmployee(employeeId);
        } catch (Exception e) {
            throw (new ApplicationException("Getting employee failed.", e));
        }
    }

    public List<Employee> listEmployees() {
        return employeeDAO.listEmployees();
    }


    public void deleteEmployee(Employee employee) throws ApplicationException {
        List<ProjectEmployee> employeeProjects = projectEmployeeDAO.getEmployeeProjects(employee);
        if (employeeProjects != null && employeeProjects.size() > 0) {
            throw (new ApplicationException("Could not delete employee, he is working in projects!"));
        }
        //jos jätät try-catchin pois, ApplicationException poikkeus välittyy suoraan DAO-funktiosta
        //talle tasolle.
        //Jos DAO-funktiosi ei anna poikkeusta, lisää try-catch tämän rivin ympärille.
        employeeDAO.deleteEmployee(employee);
    }

    public void addEmployeeToProject(String personNumber, String projectNumber, String salary) throws ApplicationException {

        Employee employee = employeeDAO.getEmployee(Integer.parseInt(personNumber));
        if (employee == null) {
            throw (new ApplicationException("Employee is not found."));
        }
        Project project = projectDAO.getProject(Integer.parseInt(personNumber));
        if (project == null) {
            throw (new ApplicationException("Project is not found."));
        }
        try {
            ProjectEmployee projectEmployee = new ProjectEmployee();
            projectEmployee.setAdded(new Date());
            projectEmployee.setEmployee(employee);
            projectEmployee.setProject(project);
            projectEmployee.setSalary(ProjectEmployee.convertStringToBigDecimal(salary));
            projectEmployeeDAO.addEmployeeToProject(projectEmployee);
        } catch (Exception e) {
            throw (new ApplicationException("Could not add employee to project"));
        }
    }

}
