package dao;

import io.ebean.DB;
import model.Customer;

import java.util.List;
/**
 * Customer CustomerManager
 */
public class CustomerDAO{
    public void addCustomer(Customer customer){
        try {
            customer.save();
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
    }

    public List<Customer> listCustomer() {
        return DB.find(Customer.class).findList();
    }
}