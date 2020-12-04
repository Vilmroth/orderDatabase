package model;

import io.ebean.Model;
import io.ebean.annotation.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Date;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"project_project_id", "employee_person_no"})})
public class ProjectEmployee extends Model {

    @Id
    private Long id;

    @NotNull
    private Date added;


    //Luodaan tietotyyppi Decimal(19,4)
    @Column(precision = 4, scale = 19)
    private BigDecimal salary;

    @ManyToOne(optional = false)
    private Project project;

    @ManyToOne(optional = false)
    private Employee employee;

    /**
     * Käytä samaa tarkkuutta (precision) kuin salary-kentässä.
     *
     * @param salary
     * @return
     */

    public static BigDecimal convertStringToBigDecimal(String salary) {
        MathContext mathContext = new MathContext(4);
        BigDecimal bigDecimal = new BigDecimal(salary, mathContext);
        bigDecimal.setScale(19);
        return bigDecimal;
    }

    public Date getAdded() {
        return added;
    }

    public void setAdded(Date added) {
        this.added = added;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
