package model.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.Transaction;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PString;
import io.ebean.typequery.PUtilDate;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import model.Delivery;

/**
 * Query bean for Delivery.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QDelivery extends TQRootBean<Delivery,QDelivery> {

  private static final QDelivery _alias = new QDelivery(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QDelivery alias() {
    return _alias;
  }

  public PInteger<QDelivery> deliveryid;
  public PInteger<QDelivery> maxweight;
  public PInteger<QDelivery> customerid;
  public PUtilDate<QDelivery> deliveryDate;
  public PString<QDelivery> deliveryAddress;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QDelivery forFetchGroup() {
    return new QDelivery(FetchGroup.queryFor(Delivery.class));
  }

  /**
   * Construct using the default Database.
   */
  public QDelivery() {
    super(Delivery.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QDelivery(Transaction transaction) {
    super(Delivery.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QDelivery(Database database) {
    super(Delivery.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QDelivery(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QDelivery(Query<Delivery> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PInteger<QDelivery> deliveryid = _alias.deliveryid;
    public static PInteger<QDelivery> maxweight = _alias.maxweight;
    public static PInteger<QDelivery> customerid = _alias.customerid;
    public static PUtilDate<QDelivery> deliveryDate = _alias.deliveryDate;
    public static PString<QDelivery> deliveryAddress = _alias.deliveryAddress;
  }
}
