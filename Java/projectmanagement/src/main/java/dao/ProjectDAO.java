package dao;

import io.ebean.DB;
import io.ebean.Expr;
import model.Employee;
import model.Project;
import utils.ApplicationException;

import java.util.List;

public class ProjectDAO {

    /**
     * Palauta id:n osoittama projekti.
     *
     * @param id
     * @return
     */

    public Project getProject(Integer id) {
        return DB.find(Project.class).where(Expr.eq("project_id", id)).findOne();
    }

    public void updateProject(Project project) throws ApplicationException {

        try {
            project.update();
        } catch (Exception e) {
            throw new ApplicationException("Error in updating project.");
        }
    }

    public Project addProject(Project project) throws ApplicationException {
        try {
            project.save();
            return project;
        } catch (Exception e) {
            throw new ApplicationException("Error in adding project.");
        }
    }

    public List<Project> listProjects() {
        return DB.find(Project.class).findList();
    }
}

