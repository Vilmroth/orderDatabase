package dao;

import model.Product;

public class ProductDAO{

    public void addProduct(Product product){
        try {
            product.save();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
