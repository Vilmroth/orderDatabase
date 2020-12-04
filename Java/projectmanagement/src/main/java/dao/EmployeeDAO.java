package dao;

import io.ebean.DB;
import io.ebean.Expr;
import model.Employee;
import utils.ApplicationException;

import java.util.List;

public class EmployeeDAO {

    public Employee getEmployee(Integer personNo) throws ApplicationException {
        try {
            return DB.find(Employee.class).where(Expr.eq("person_no", personNo)).findOne();
        } catch (Exception e) {
            throw new ApplicationException("Error in finding the employee.");
        }
    }

    public Employee addEmployee(Employee employee) throws ApplicationException {
        try {
            employee.save();
            return employee;
        } catch (Exception e) {
            throw new ApplicationException("Error in adding employee.");
        }
    }

    public Employee updateEmployee(Employee employee) throws ApplicationException {
        try {
            employee.update();
            return employee;
        } catch (Exception e) {
            throw new ApplicationException("Error in updating employee.");
        }
    }

    public List<Employee> listEmployees() {
        return DB.find(Employee.class).findList();
    }

    public void deleteEmployee(Employee employee) throws ApplicationException {
        try {
            employee.delete();
        } catch (Exception e) {
            throw new ApplicationException("Error in deleting employee.");
        }
    }
}
