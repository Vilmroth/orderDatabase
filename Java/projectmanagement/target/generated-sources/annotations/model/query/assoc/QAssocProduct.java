package model.query.assoc;

import io.ebean.Transaction;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import model.Product;
import model.query.QProduct;

/**
 * Association query bean for AssocProduct.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QAssocProduct<R> extends TQAssocBean<Product,R> {

  public PInteger<R> productId;
  public PString<R> productName;
  public PInteger<R> price;
  public PInteger<R> size;
  public PInteger<R> weight;
  public PInteger<R> storageLocation;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetch(TQProperty<QProduct>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchQuery(TQProperty<QProduct>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchCache(TQProperty<QProduct>... properties) {
    return fetchCacheProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchLazy(TQProperty<QProduct>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocProduct(String name, R root) {
    super(name, root);
  }

  public QAssocProduct(String name, R root, String prefix) {
    super(name, root, prefix);
  }
}
