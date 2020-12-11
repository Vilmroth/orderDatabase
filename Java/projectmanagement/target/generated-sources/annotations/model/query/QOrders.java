package model.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.Transaction;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PUtilDate;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import model.Orders;

/**
 * Query bean for Orders.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QOrders extends TQRootBean<Orders,QOrders> {

  private static final QOrders _alias = new QOrders(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QOrders alias() {
    return _alias;
  }

  public PInteger<QOrders> orderId;
  public PInteger<QOrders> deliveryId;
  public PInteger<QOrders> customerId;
  public PUtilDate<QOrders> orderDate;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QOrders forFetchGroup() {
    return new QOrders(FetchGroup.queryFor(Orders.class));
  }

  /**
   * Construct using the default Database.
   */
  public QOrders() {
    super(Orders.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QOrders(Transaction transaction) {
    super(Orders.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QOrders(Database database) {
    super(Orders.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QOrders(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QOrders(Query<Orders> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PInteger<QOrders> orderId = _alias.orderId;
    public static PInteger<QOrders> deliveryId = _alias.deliveryId;
    public static PInteger<QOrders> customerId = _alias.customerId;
    public static PUtilDate<QOrders> orderDate = _alias.orderDate;
  }
}
