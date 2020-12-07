package model;

import io.ebean.Model;
import io.ebean.annotation.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

    
    /*
 * Product table
 * @param Integer productid -- auto increment
 * @param String productname
 * @param Integer PRICE
 * @param Integer SIZE
 * @param Integer weight
 * @param Storages STORAGELOCATION
 */
@Entity
public class Product extends Model {

    @Id
    private Integer productId; // auto increment
    @NotNull
    private String productName;
    // Viiteavain project-tauluun (tietenkin sen pääavaimeen)
    // luo tietokantaan kentän nimeltään project_project_id.
    // Muoto perustuu
    // nimeämiseen: <isätaulunnimi>_<isätaulunpääavaimennimi>
    // private Project project
    @NotNull
    private Integer price;
    @NotNull
    private Integer size;
    @NotNull
    private Integer weight;
    @ManyToOne
    private Integer storageLocation;

        public Product() {}

    public Product(String productName, Integer price, Integer size, Integer weight) {
        this.productName = productName;
        this.price = price;
        this.size = size;
        this.weight = weight;
    }
    // sets
    public void setStorageLocation(Storages storages){
        this.storageLocation = storages.getStorageLocation();
    }
    // gets

    public Integer getProductId(){
        return this.productId;
    }
}