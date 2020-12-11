package model.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.Transaction;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import model.Customer;

/**
 * Query bean for Customer.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QCustomer extends TQRootBean<Customer,QCustomer> {

  private static final QCustomer _alias = new QCustomer(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QCustomer alias() {
    return _alias;
  }

  public PInteger<QCustomer> customerId;
  public PString<QCustomer> company;
  public PString<QCustomer> forename;
  public PString<QCustomer> surname;
  public PString<QCustomer> address;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QCustomer forFetchGroup() {
    return new QCustomer(FetchGroup.queryFor(Customer.class));
  }

  /**
   * Construct using the default Database.
   */
  public QCustomer() {
    super(Customer.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QCustomer(Transaction transaction) {
    super(Customer.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QCustomer(Database database) {
    super(Customer.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QCustomer(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QCustomer(Query<Customer> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PInteger<QCustomer> customerId = _alias.customerId;
    public static PString<QCustomer> company = _alias.company;
    public static PString<QCustomer> forename = _alias.forename;
    public static PString<QCustomer> surname = _alias.surname;
    public static PString<QCustomer> address = _alias.address;
  }
}
