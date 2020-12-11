package model;

import io.ebean.Model;
import io.ebean.annotation.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * Customer table
 * @param Integer customerid -- auto increment
 * @param String company
 * @param String forename
 * @param String surname
 * @param String address
 */
@Entity
public class Customer extends Model {
    
    @Id
    private Integer customerId; // auto increment
    @NotNull
    private String company;
    @NotNull
    private String forename;
    @NotNull
    private String surname;
    @NotNull
    private String address;

    public Customer() {}

    public Customer(String company, String fname, String lname, String address) {
        this.company = company;
        this.forename = fname;
        this.surname = lname;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + forename + '\'' +
                ", lastName='" + surname + '\'' +
                ", company=" + company +
                ", title='" + address + '\'' +
                '}';
    }
    // sets
    public void setCompany(String company){
        this.company = company;
    }

    public void setForename(String forename){
        this.forename = forename;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setAddress(String address){
        this.address = address;
    }
    // gets

    public String getCompany(){
        return this.company;
    }

    public String getForename(){
        return this.forename;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getAddress(){
        return this.address;
    }
    public Integer getCustomerId() {
        return this.customerId;
    }
    public void print_customerid(){
        System.out.println(this.customerId);
    }

}