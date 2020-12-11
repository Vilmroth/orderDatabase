package manager;


import controllers.CustomerController;
import controllers.EmployeeController;
import model.*;
import utils.ApplicationException;
import utils.DatabaseMigrator;
import utils.DateTimeUtils;


public class CustomerManager {

    private static CustomerController customercontroller = new CustomerController();

    public static void main(String[] args) {
        try {
            DatabaseMigrator.doMigrations();
            if (args.length > 0) {
                String command = args[0];
                if (command.equalsIgnoreCase("addcustomer")) {
                    addCustomer(args);
                }
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void addCustomer(String[] args) throws ApplicationException {
        if (args.length != 5){
            throw (new ApplicationException("parameters: <company> <forenamy> <surname> <address>"));
        }
        else{
            customercontroller.addCustomer(args[1], args[2], args[3], args[4]);
        }
    }
}