package model.query.assoc;

import io.ebean.Transaction;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PString;
import io.ebean.typequery.PUtilDate;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import model.Delivery;
import model.query.QDelivery;

/**
 * Association query bean for AssocDelivery.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QAssocDelivery<R> extends TQAssocBean<Delivery,R> {

  public PInteger<R> deliveryId;
  public PInteger<R> maxweight;
  public PInteger<R> customerId;
  public PUtilDate<R> deliveryDate;
  public PString<R> deliveryAddress;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetch(TQProperty<QDelivery>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchQuery(TQProperty<QDelivery>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchCache(TQProperty<QDelivery>... properties) {
    return fetchCacheProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchLazy(TQProperty<QDelivery>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocDelivery(String name, R root) {
    super(name, root);
  }

  public QAssocDelivery(String name, R root, String prefix) {
    super(name, root, prefix);
  }
}
