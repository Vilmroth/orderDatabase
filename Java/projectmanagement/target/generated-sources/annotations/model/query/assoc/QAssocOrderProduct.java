package model.query.assoc;

import io.ebean.Transaction;
import io.ebean.typequery.PBigInteger;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import model.OrderProduct;
import model.query.QOrderProduct;

/**
 * Association query bean for AssocOrderProduct.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QAssocOrderProduct<R> extends TQAssocBean<OrderProduct,R> {

  public PBigInteger<R> orderProduct;
  public PInteger<R> productCount;
  public PInteger<R> productId;
  public PInteger<R> orderId;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetch(TQProperty<QOrderProduct>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchQuery(TQProperty<QOrderProduct>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchCache(TQProperty<QOrderProduct>... properties) {
    return fetchCacheProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchLazy(TQProperty<QOrderProduct>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocOrderProduct(String name, R root) {
    super(name, root);
  }

  public QAssocOrderProduct(String name, R root, String prefix) {
    super(name, root, prefix);
  }
}
