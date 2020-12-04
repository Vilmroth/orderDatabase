package model.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.Transaction;
import io.ebean.typequery.PBigDecimal;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.PUtilDate;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import model.Expense;
import model.query.assoc.QAssocWork;

/**
 * Query bean for Expense.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QExpense extends TQRootBean<Expense,QExpense> {

  private static final QExpense _alias = new QExpense(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QExpense alias() {
    return _alias;
  }

  public PLong<QExpense> expenseId;
  public PString<QExpense> state;
  public PString<QExpense> description;
  public PUtilDate<QExpense> dte;
  public PBigDecimal<QExpense> sum;
  public QAssocWork<QExpense> work;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QExpense forFetchGroup() {
    return new QExpense(FetchGroup.queryFor(Expense.class));
  }

  /**
   * Construct using the default Database.
   */
  public QExpense() {
    super(Expense.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QExpense(Transaction transaction) {
    super(Expense.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QExpense(Database database) {
    super(Expense.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QExpense(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QExpense(Query<Expense> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PLong<QExpense> expenseId = _alias.expenseId;
    public static PString<QExpense> state = _alias.state;
    public static PString<QExpense> description = _alias.description;
    public static PUtilDate<QExpense> dte = _alias.dte;
    public static PBigDecimal<QExpense> sum = _alias.sum;
    public static QAssocWork<QExpense> work = _alias.work;
  }
}
