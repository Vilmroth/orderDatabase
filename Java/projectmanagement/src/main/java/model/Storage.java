package model;

import io.ebean.Model;
import io.ebean.annotation.NotNull;
import utils.ApplicationException;
import utils.DateTimeUtils;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.SimpleDateFormat;
import java.util.Date;


@Entity
public class Storage extends Model {
    @Id
    private Integer storagelocation;
    @NotNull
    private Integer capacity;
    private String productname;

    public Storage(){}

    public Storage(Integer capacity, String productname) {
        this.capacity = capacity;
        this.productname = productname;
    }
}