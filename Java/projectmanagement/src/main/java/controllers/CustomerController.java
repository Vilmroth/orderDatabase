package controllers;

import dao.CustomerDAO;
import model.Customer;
import java.util.List;


/**
 * Customer CustomerController
 */
public class CustomerController {

    CustomerDAO customerDAO = new CustomerDAO();

    public void addCustomer(String company, String forename, String surname, String address) {
        try{
            Customer customer = new Customer();
            customer.setCompany(company);
            customer.setForename(forename);
            customer.setSurname(surname);
            customer.setAddress(address);
            customerDAO.addCustomer(customer);
        } catch (Exception e){
            System.out.println("Virhe: " + e.getMessage());
        }
    } 

    public List<Customer> listCustomer() {
        return customerDAO.listCustomer();
    }


}