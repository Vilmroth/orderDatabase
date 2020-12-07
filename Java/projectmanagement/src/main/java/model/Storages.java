package model;

import io.ebean.Model;
import io.ebean.annotation.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Storage table
 * @param Integer storagelocation
 * @param String capacity
 * @param String productname
 */

@Entity
public class Storages extends Model {
    @Id
    private Integer storagelocation; // auto increment
    @NotNull
    private Integer capacity;
    private String productname;

    public Storages(){}

    public Storages(Integer capacity, String productname) {
        this.capacity = capacity;
        this.productname = productname;
    }
    // sets
    public void setCapacity(Integer capacity){
        this.capacity = capacity;
    }

    public void setProductname(String productname){
        this.productname = productname;
    }

   // gets
    public Integer getCapacity(){
        return this.capacity;
    }

    public Integer getStorageLocation(){
    return this.storagelocation;
}

    public String getProductname(){
        return this.productname;
    }
}