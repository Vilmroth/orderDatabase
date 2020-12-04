package dao;

import io.ebean.DB;
import io.ebean.Expr;
import model.Employee;
import model.ProjectEmployee;

import java.util.List;

public class ProjectEmployeeDAO {

    /**
     * Palauttaa listan projekteja, joissa henkilö työskentelee.
     * @param employee
     * @return
     */

    public List<ProjectEmployee> getEmployeeProjects(Employee employee) {
        return DB.find(ProjectEmployee.class).where(Expr.eq("person_no", employee.getPersonNo())).findList();
    }

    public void addEmployeeToProject(ProjectEmployee projectEmployee) {
        projectEmployee.save();
    }
}
