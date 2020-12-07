package model.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.Transaction;
import io.ebean.typequery.PBigInteger;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import model.OrderProduct;

/**
 * Query bean for OrderProduct.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QOrderProduct extends TQRootBean<OrderProduct,QOrderProduct> {

  private static final QOrderProduct _alias = new QOrderProduct(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QOrderProduct alias() {
    return _alias;
  }

  public PBigInteger<QOrderProduct> orderProduct;
  public PInteger<QOrderProduct> productCount;
  public PInteger<QOrderProduct> productId;
  public PInteger<QOrderProduct> orderId;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QOrderProduct forFetchGroup() {
    return new QOrderProduct(FetchGroup.queryFor(OrderProduct.class));
  }

  /**
   * Construct using the default Database.
   */
  public QOrderProduct() {
    super(OrderProduct.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QOrderProduct(Transaction transaction) {
    super(OrderProduct.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QOrderProduct(Database database) {
    super(OrderProduct.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QOrderProduct(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QOrderProduct(Query<OrderProduct> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PBigInteger<QOrderProduct> orderProduct = _alias.orderProduct;
    public static PInteger<QOrderProduct> productCount = _alias.productCount;
    public static PInteger<QOrderProduct> productId = _alias.productId;
    public static PInteger<QOrderProduct> orderId = _alias.orderId;
  }
}
