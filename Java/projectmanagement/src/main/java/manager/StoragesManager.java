package manager;

import controllers.StoragesController;
import utils.ApplicationException;
import utils.DatabaseMigrator;

public class StoragesManager {

    private static StoragesController storagescontroller = new StoragesController();

    public static void main(String[] args) {
        try {
            DatabaseMigrator.doMigrations();
            if (args.length > 0) {
                String command = args[0];
                if (command.equalsIgnoreCase("addstorages")) {
                    addStorages(args);
                }
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void addStorages(String[] args) throws ApplicationException {
        if (args.length != 3){
            throw (new ApplicationException("parameters: <capacity> <productname>"));
        }
        else{
            storagescontroller.addStorages(Integer.parseInt(args[1]), args[2]);
        }
    }
}