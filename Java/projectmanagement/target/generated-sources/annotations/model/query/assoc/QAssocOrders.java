package model.query.assoc;

import io.ebean.Transaction;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PUtilDate;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import model.Orders;
import model.query.QOrders;

/**
 * Association query bean for AssocOrders.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QAssocOrders<R> extends TQAssocBean<Orders,R> {

  public PInteger<R> orderId;
  public PInteger<R> deliveryId;
  public PInteger<R> customerId;
  public PUtilDate<R> orderDate;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetch(TQProperty<QOrders>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchQuery(TQProperty<QOrders>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchCache(TQProperty<QOrders>... properties) {
    return fetchCacheProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchLazy(TQProperty<QOrders>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocOrders(String name, R root) {
    super(name, root);
  }

  public QAssocOrders(String name, R root, String prefix) {
    super(name, root, prefix);
  }
}
