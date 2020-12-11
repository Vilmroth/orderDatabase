package manager;


import controllers.ProductController;
import utils.ApplicationException;
import utils.DatabaseMigrator;
import model.Product;
import java.util.List;

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
            productcontroller.addProduct(args[1], Integer.parseInt(args[2]),Integer.parseInt(args[3]),Integer.parseInt(args[4]));
        }   
    }

    private static void listProducts() {
        List<Product> products = productcontroller.listProduct();
        for (Product product : products) {
            System.out.println(product);
        }
    }
}