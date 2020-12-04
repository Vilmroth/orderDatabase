package manager;

import controllers.EmployeeController;
import model.Customer;
import model.Delivery;
import model.Employee;
import model.Storages;
import utils.ApplicationException;
import utils.DatabaseMigrator;
import utils.DateTimeUtils;

import java.util.List;
// drop table flyway_schema_history;
// drop table project_employee;
// drop table project;
// drop table employee;
// drop table customer;
// drop table delivery;



public class EmployeeManager {

    //HUOM!!! WEB-CONTROLLEREISSA ÄLÄ KÄYTÄ STAATTISIA MUUTTUJIA!
    private static EmployeeController employeeController = new EmployeeController();

    public static void main(String[] args) {
        DatabaseMigrator.doMigrations();
        Customer customer1 = new Customer("Telia", "Ville", "Puska", "Seinajoki 5");
        Customer customer2 = new Customer("Mcdonalds", "Juho", "Maki", "Vaasa 655");
        customer1.save();
        customer2.save();

        DatabaseMigrator.doMigrations();
        Delivery delivery1 = new Delivery(5,"2020-05-01", "Seinajoki 5");
        Delivery delivery2 = new Delivery(255,"2021-09-08", "Laihia 12");
        delivery1.setCustomerId(customer1);
        delivery1.save();
        delivery2.setCustomerId(customer2);
        delivery2.save();

        DatabaseMigrator.doMigrations();
        Storages storage =  new Storages(25, "auto");
        storage.save();
    }


    private static void addEmployeeToProject(String[] args) throws ApplicationException {
        if (args.length != 4) {
            throw (new ApplicationException("parameters: <employee number> <project id> <salary>"));
        } else {
            employeeController.addEmployeeToProject(args[1], args[2], args[3]);
        }
    }

    private static void listEmployees() {
        List<Employee> employees = employeeController.listEmployees();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static void updateEmployee(String[] args) throws ApplicationException {
        if (args.length != 7) {
            throw (new ApplicationException("parameters: <firstname> <lastname> <birthdate in format DD-MM-YYYY> <title> <phonenumber>"));
        } else {
            Integer employeeId = Integer.parseInt(args[1]);
            Employee currentEmployee=employeeController.getEmployee(employeeId);
            if (currentEmployee==null){
                throw(new ApplicationException("Employee does not exist."));
            }
            currentEmployee.setPersonNo(Integer.parseInt(args[1]));
            currentEmployee.setFirstName(args[2]);
            currentEmployee.setLastName(args[3]);
            currentEmployee.setBirthDate(DateTimeUtils.formatDDMMYYDate(args[4]));
            currentEmployee.setTitle(args[5]);
            currentEmployee.setPhoneNumber(args[6]);
            employeeController.updateEmployee(currentEmployee);
        }
    }

    private static void deleteEmployee(String[] args) throws ApplicationException {
        if (args.length != 2) {
            throw (new ApplicationException("parameters: <employee id>"));
        } else {
            Employee employee = employeeController.getEmployee(Integer.parseInt(args[1]));
            employeeController.deleteEmployee(employee);
        }
    }

    private static void addEmployee(String[] args) throws ApplicationException {
        if (args.length != 4) {
            throw (new ApplicationException("parameters: <firstname> <lastname> <birthdate in format DD-MM-YYYY>"));
        } else {
            Employee employee = new Employee(args[1], args[2], args[3]);
            employeeController.addEmployee(employee);
        }
    }




}

        // DatabaseMigrator.doMigrations();
        // Employee employee = new Employee();
        // employee.setFirstName("Maarit");
        // employee.setLastName("Välisuo");
        // employee.save();
        // try {
        //     DatabaseMigrator.doMigrations();
        //     if (args.length > 0) {
        //         String command = args[0];
        //         if (command.equalsIgnoreCase("addemployee")) {
        //             addEmployee(args);
        //         } else if (command.equalsIgnoreCase("updateemployee")) {
        //             deleteEmployee(args);
        //         } else if (command.equalsIgnoreCase("deleteemployee")) {
        //             updateEmployee(args);
        //         } else if (command.equalsIgnoreCase("listemployees")) {
        //             listEmployees();
        //         } else if (command.equalsIgnoreCase("addemployeetoproject")) {
        //             addEmployeeToProject(args);
        //         }
        //     } else {
        //         System.out.println("usage: java EmployeeManager addemployee | updateemployee | deleteemployee | listemployees");
        //     }
        // } catch (Exception e) {
        //     System.out.println("Virhe: " + e.getMessage());
        // }