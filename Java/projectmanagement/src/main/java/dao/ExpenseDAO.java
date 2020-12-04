package dao;

import io.ebean.DB;
import io.ebean.Expr;
import model.Expense;
import model.Work;
import utils.ApplicationException;

import java.util.ArrayList;
import java.util.List;

public class ExpenseDAO {

    /*
 Hae kustannukset, jotka liittyvät tiettyyn työhön.
 */
    public List<Expense> getWorkExpenses(Work work) {
        return DB.find(Expense.class).where(Expr.eq("work_id", work.getWorkId())).findList();
    }

    public Expense addExpense(Expense expense) throws ApplicationException {
        try {
            expense.save();
            return expense;
        } catch (Exception e) {
            System.err.println("Error in adding expense. " + e.getMessage());
            throw new ApplicationException("Error in adding expense.");
        }
    }

    public void deleteExpense(Expense expense) throws ApplicationException {
        try {
            expense.delete();
        } catch (Exception e) {
            System.err.println("Error in deleting expense. " + e.getMessage());
            throw new ApplicationException("Error in deleting expense.");
        }
    }

    public void updateExpense(Expense expense) throws ApplicationException {
        try {
            expense.update();
        } catch (Exception e) {
            System.err.println("Error in updating expense. " + e.getMessage());
            throw new ApplicationException("Error in updating expense.");
        }
    }

}
