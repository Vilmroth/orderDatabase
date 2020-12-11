package manager;


import controllers.ProductController;
import utils.ApplicationException;
import utils.DatabaseMigrator;


public class ProductManager {

     private static ProductController productcontroller = new ProductController();

    public static void main(String[] args) {
         try {
             DatabaseMigrator.doMigrations();
             if (args.length > 0) {
                String command = args[0];
                if (command.equalsIgnoreCase("addproduct")) {
                    addProduct(args);
                }
             }
         } catch (Exception e){
             System.out.println("Error: " + e.getMessage());
         }
    }


    private static void addProduct(String[] args) throws ApplicationException {
        if (args.length != 5){
            throw (new ApplicationException("parameters: <productname> <price> <size> <weight>"));
        }
        else{
            productcontroller.addProduct(args[1], args[2], args[3], args[4]);
        }   
    }
}