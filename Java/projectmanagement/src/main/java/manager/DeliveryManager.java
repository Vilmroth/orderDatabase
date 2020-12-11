package manager;

import controllers.DeliveryController;
import utils.ApplicationException;
import utils.DatabaseMigrator;
import utils.DateTimeUtils;

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
        if (args.length != 5) {
            throw (new ApplicationException("parameter: <deliveryDate> <deliveryAddress> <maxWeight> <customerid>"));
        }
        else {
            deliveryController.addDelivery(DateTimeUtils.formatDDMMYYDate(args[1]), args[2], Integer.parseInt(args[3]), Integer.parseInt(args[4]));
        }
    }
}
