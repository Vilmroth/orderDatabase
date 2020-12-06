package model;

import io.ebean.Model;
import io.ebean.annotation.NotNull;
import utils.ApplicationException;
import utils.DateTimeUtils;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Customer table
 * @param Integer deliveryid -- auto increment
 * @param Integer maxweight
 * @param Customer customerid
 * @param Date delivery_date
 * @param String delivery_address
 */
@Entity
public class Delivery extends Model {
    
    @Id
    private Integer deliveryId; // auto increment
    @NotNull
    private Integer maxweight;
    // Viiteavain project-tauluun (tietenkin sen pääavaimeen)
    // luo tietokantaan kentän nimeltään project_project_id.
    // Muoto perustuu
    // nimeämiseen: <isätaulunnimi>_<isätaulunpääavaimennimi>
    // private Project project
    @ManyToOne
    private Integer customerId;
    @NotNull
    private Date deliveryDate;
    @NotNull
    private String deliveryAddress;

    

    public Delivery() {}

    public Delivery(Integer maxweight, String deliveryDate, String deliveryAddress) {
        this.maxweight = maxweight;
        this.deliveryAddress = deliveryAddress;
        try {
            this.deliveryDate= DateTimeUtils.formatDDMMYYDate(deliveryDate);
        } catch (ApplicationException e) {

        }
    }
    // sets
    public void setCustomerId(Customer customer){
        this.customerId = customer.getCustomerId();
    }
    // gets
}