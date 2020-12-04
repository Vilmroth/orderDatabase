package model;


import io.ebean.Model;
import io.ebean.annotation.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Expense extends Model {

    public static final String PAID = "maksettu";
    public static final String OPEN = "avoin";
    @Id
    private Long expenseId;

    @NotNull
    private String state;

    @NotNull
    @Column(columnDefinition = "TEXT")
    private String description;

    @NotNull
    private Date dte;

    @NotNull
    @Column(precision = 19, scale = 4)
    private BigDecimal sum;

    @ManyToOne(optional=false)
    Work work;

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public Long getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Long expenseId) {
        this.expenseId = expenseId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDte() {
        return dte;
    }

    public void setDte(Date dte) {
        this.dte = dte;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }
}
