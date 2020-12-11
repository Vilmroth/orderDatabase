package dao;

import model.Customer;

public class CustomerDAO{
    public void addCustomer(Customer customer){
        try {
            customer.save();
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
    }
}