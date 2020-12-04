package model;

import io.ebean.Model;
import io.ebean.annotation.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Project extends Model {

    @Id
    private Integer projectId;
    @NotNull
    private Date begins;
    private Date ends;
    private String name;
    @NotNull
    private String customer;
    @ManyToOne
    private Employee projectManager;

    private String state;

    public static final String ACTIVE ="aktiivinen";
    public static final String ENDED ="loppunut";

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Date getBegins() {
        return begins;
    }

    public void setBegins(Date begins) {
        this.begins = begins;
    }

    public Date getEnds() {
        return ends;
    }

    public void setEnds(Date ends) {
        this.ends = ends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Employee getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(Employee Projectpaallikko) {
        this.projectManager = Projectpaallikko;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
