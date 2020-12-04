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
public class Employee extends Model {

    public static final String PROJECTMANAGER = "projectmanager";
    @Id
    private Integer personNo;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private Date birthDate;
    private String title;

    private String phoneNumber;

    @Transient
    private double age;

    public Employee() {}

    public Employee(String fname, String lname, String birthDate) {
        this.firstName=fname;
        this.lastName=lname;
        try {
            this.birthDate= DateTimeUtils.formatDDMMYYDate(birthDate);
        } catch (ApplicationException e) {

        }
    }


    @Override
    public String toString() {
        return "Employee{" +
                "personNo=" + personNo +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", title='" + title + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Integer getPersonNo() {
        return personNo;
    }

    public void setPersonNo(Integer personNo) {
        this.personNo = personNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
