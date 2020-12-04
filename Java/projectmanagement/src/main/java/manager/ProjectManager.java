package manager;

import controllers.EmployeeController;
import controllers.ProjectController;
import controllers.ProjectController;
import model.Employee;
import model.Project;
import utils.ApplicationException;
import utils.DatabaseMigrator;
import utils.DateTimeUtils;

import java.util.List;

public class ProjectManager {

    //HUOM!!! WEB-CONTROLLEREISSA ÄLÄ KÄYTÄ STAATTISIA MUUTTUJIA!
    private static ProjectController projectController = new ProjectController();
    private static EmployeeController employeeController = new EmployeeController();

    public static void main(String[] args) {
        try {
            DatabaseMigrator.doMigrations();
            if (args.length > 0) {
                String command = args[0];
                if (command.equalsIgnoreCase("addproject")) {
                    addProject(args);
                } else if (command.equalsIgnoreCase("updateproject")) {
                    deleteProject(args);
                } else if (command.equalsIgnoreCase("deleteproject")) {
                    updateProject(args);
                } else if (command.equalsIgnoreCase("listprojects")) {
                    listProjects();
                }
            } else {
                System.out.println("usage: java ProjectManager addproject | updateproject | deleteproject | listprojects");
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
    }
    

    private static void listProjects() {
        List<Project> projects = projectController.listProjects();
        for (Project project : projects) {
            System.out.println(project);
        }
    }

    private static void updateProject(String[] args) throws ApplicationException {
        if (args.length != 5) {
            throw (new ApplicationException("parameters: <projectid> <begins in format DD-MM-YYYY> <customer> <projectmanager>"));
        } else {
            Integer projectId = Integer.parseInt(args[1]);
            Project currentProject=projectController.getProject(projectId);
            if (currentProject==null){
                throw(new ApplicationException("Project does not exist."));
            }
            currentProject.setBegins(DateTimeUtils.formatDDMMYYDate(args[2]));
            currentProject.setCustomer(args[3]);
            String pm = args[4];
            try {
                Employee projectManager = employeeController.getEmployee(Integer.parseInt(pm));
                if (projectManager!=null) {
                    currentProject.setProjectManager(projectManager);
                }
            }
            catch (Exception e){
                throw (new ApplicationException("Updating project failed. "+e.getMessage()));
            }
            projectController.updateProject(currentProject);
        }
    }

    private static void deleteProject(String[] args) throws ApplicationException {
        if (args.length != 2) {
            throw (new ApplicationException("parameters: <project id>"));
        } else {
            Project project = projectController.getProject(Integer.parseInt(args[1]));
            projectController.getProject(project.getProjectId());
        }
    }

    private static void addProject(String[] args) throws ApplicationException {
        if (args.length != 6) {
            throw (new ApplicationException("parameters: <begins in format DD-MM-YYYY> <customer> <projectmanager> <ends> <name>"));
        } else {
            Project project = new Project();

            project.setBegins(DateTimeUtils.formatDDMMYYDate(args[1]));
            project.setCustomer(args[2]);
            project.setEnds(DateTimeUtils.formatDDMMYYDate(args[4]));
            project.setName(args[5]);
            String pm = args[3];
            try {
                Employee projectManager = employeeController.getEmployee(Integer.parseInt(pm));
                if (projectManager != null) {
                    project.setProjectManager(projectManager);
                }
            } catch (Exception e) {
                throw (new ApplicationException("Adding project failed. " + e.getMessage()));
            }
            projectController.addProject(project);
        }
    }




}
