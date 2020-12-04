package dao;

import io.ebean.DB;
import io.ebean.Expr;
import model.Work;
import utils.ApplicationException;

import java.util.List;

public class WorkDAO {

    public List<Work> getWorkt() {
        List<Work> work = DB.find(Work.class).findList();
        return work;
    }

    public Work addWork(Work work) throws ApplicationException {
        try {
            work.save();
            return work;
        } catch (Exception e) {
            throw (new ApplicationException("Adding work failed."));
        }
    }

    public void deleteWork(Work work) throws ApplicationException {
        try {
            work.delete();
        } catch (Exception e) {
            throw (new ApplicationException("Deleting work failed."));
        }
    }

    public Work getWork(Long id) throws ApplicationException {
        try {
            return DB.find(Work.class).where(Expr.eq("id", id)).findOne();
        } catch (Exception e) {
            throw (new ApplicationException("Finding work failed."));
        }
    }

    public void updateWork(Work work) throws ApplicationException {
        try {
            work.update();
        } catch (Exception e) {
            throw (new ApplicationException("Updating work failed."));
        }
    }

    public List<Work> getWorkForProject(Integer projectId) throws ApplicationException {
        try {
            List<Work> work = DB.find(Work.class).where(Expr.eq("project_id", projectId)).findList();
            return work;
        } catch (Exception e) {
            throw (new ApplicationException("Error in listing works for the project"));
        }
    }
}
