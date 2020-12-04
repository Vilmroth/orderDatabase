package model;

import io.ebean.Model;
import io.ebean.annotation.NotNull;
import utils.ApplicationException;
import utils.DateTimeUtils;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Customer table
 * @param Integer deliveryid -- auto increment
 * @param Integer maxweight
 * @param Integer customerid
 * @param Date delivery_date
 * @param String delivery_address
 */
@Entity
public class Delivery extends Model {
    
    @Id
    private Integer deliveryid; // auto increment
    @NotNull
    private Integer maxweight;
    @NotNull
    private Integer customerid;
    @NotNull
    private Date deliveryDate;
    @NotNull
    private String deliveryAddress;
    

    public Delivery() {}

    public Delivery(Integer maxweight, Integer customerid, String deliveryDate, String deliveryAddress) {
        this.maxweight = maxweight;
        this.customerid = customerid;
        this.deliveryAddress = deliveryAddress;
        try {
            this.deliveryDate= DateTimeUtils.formatDDMMYYDate(deliveryDate);
        } catch (ApplicationException e) {

        }
    }
    // sets

    // gets
}