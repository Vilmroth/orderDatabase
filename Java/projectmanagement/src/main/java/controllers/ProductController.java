package controllers;

import dao.ProductDAO;
import model.Product;


public class ProductController {
    ProductDAO productDAO = new ProductDAO();

    public void addProduct(String productname, Integer price, Integer size, Integer weight) {
        try{
            Product product = new Product();
            product.setProductname(productname);
            product.setPrice(price);
            product.setSize(size);
            product.setWeight(weight);
            productDAO.addProduct(product);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}