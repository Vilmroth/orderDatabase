package manager;


import controllers.ProductController;
import utils.ApplicationException;
import utils.DatabaseMigrator;


public class ProductManager {

     private static ProductController productcontroller = new ProductController();

    public static void main(String[] args) {
         System.out.println("Error: ");
         try {
             DatabaseMigrator.doMigrations();
             if (args.length > 0) {

             }
         } catch (Exception e){
             System.out.println("Error: " + e.getMessage());
         }
    }


    private static void addProduct(Sting[] args) throws ApplicationException {
        if (args.length != 6){
            throw (new ApplicationException("parameters: <productname> <price> <size> <weight> <storagelocation>"));
        }
        else{
            productcontroller.addProduct(args[1], args[2], args[3], args[4], args[5]);
        }   
    }
}