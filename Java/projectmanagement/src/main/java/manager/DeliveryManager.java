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
import utils.DatabaseMigrator;

public class DeliveryManager {

    private static DeliveryController deliveryController = new DeliveryController();

    public static void main(String[] args) {
        try {
            DatabaseMigrator.doMigrations();
            if (args.length > 0) {
                String command = args[0];
                if (command.equalsIgnoreCase("adddelivery")) {
                    addDelivery(args);
                }
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void addDelivery(String[] args) throws ApplicationException {
        if (args.length != 4) {
            throw (new ApplicationException("parameter: <deliveryDate> <deliveryAddress> <maxWeight"));
        }
        else {
            deliveryController.addDelivery(args[1], args[2]), args[3], args[4]);
        }
    }
}
