package controllers;

import dao.ExpenseDAO;
import dao.ProjectDAO;
import dao.WorkDAO;
import model.Expense;
import model.Project;
import model.Work;
import utils.ApplicationException;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class WorkController {

    WorkDAO workDAO = new WorkDAO();
    ExpenseDAO expenseDAO = new ExpenseDAO();
    ProjectDAO projectDAO = new ProjectDAO();

    
    public void addWork(String selite, Integer Projecttunnus) throws ApplicationException {
        if (Projecttunnus != null && selite != null) {
            Project project = projectDAO.getProject(Projecttunnus);
            if (project == null) {
                throw (new ApplicationException("Projektia ei ole"));
            }
            if (project.getState().equals(Project.ENDED)) {
                throw (new ApplicationException("Työtä ei voi lisätä, koska projekti on päättynyt."));
            }
            Work work = new Work();
            work.setProject(project);
            work.setDescription(selite);
            work = workDAO.addWork(work);
            System.out.println("Lisätty työ numero " + work.getWorkId());
        } else {
            throw (new ApplicationException("Työtä ei voi lisätä, jos projektia ja selitettä ei ole annettu."));
        }
    }

    public void deleteWork(Long tunnus) throws ApplicationException {
        if (tunnus == null) {
            throw (new ApplicationException("Työtunnus täytyy antaa."));
        }
        Work work = workDAO.getWork(tunnus);
        if (work ==null){
            throw (new ApplicationException("Poistettavaa työtä ei löydy"));
        }
        List<Expense> expenseList = expenseDAO.getWorkExpenses(work);
        if (expenseList !=null && expenseList.size()>0){
            throw (new ApplicationException("Työhön liittyy kustannuksia, sitä ei voi poistaa."));
        }
        workDAO.deleteWork(work);
    }

    public void addWorkExpense(Long workId, String selite, Date pvm, BigDecimal summa) throws ApplicationException {
        if (workId == null || selite == null || summa == null || pvm == null) {
            throw (new ApplicationException("Työtunnus, selite, pvm ja summa täytyy antaa"));
        }
        Work work = workDAO.getWork(workId);
        if (work == null) {
            throw (new ApplicationException("Työtä " + workId + " ei ole."));
        }
        Expense expense = new Expense();
        expense.setDte(pvm);
        expense.setDescription(selite);
        expense.setState(expense.OPEN);
        expense.setSum(summa);
        expense.setWork(work);
        expenseDAO.addExpense(expense);
    }


}
