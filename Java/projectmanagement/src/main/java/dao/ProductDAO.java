package dao;

import io.ebean.DB;
import model.Product;

import java.util.List;
public class ProductDAO{

    public void addProduct(Product product){
        try {
            product.save();
        } catch (Exception e) {
            System.out.println("Error adding new product: " + e.getMessage());
        }
    }

    public List<Product> listProduct() {
        return DB.find(Product.class).findList();
    }
}
