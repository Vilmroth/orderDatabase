package model.query.assoc;

import io.ebean.Transaction;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import model.Asiakas;
import model.query.QAsiakas;

/**
 * Association query bean for AssocAsiakas.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QAssocAsiakas<R> extends TQAssocBean<Asiakas,R> {

  public PInteger<R> customerid;
  public PString<R> company;
  public PString<R> forename;
  public PString<R> surname;
  public PString<R> address;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetch(TQProperty<QAsiakas>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchQuery(TQProperty<QAsiakas>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchCache(TQProperty<QAsiakas>... properties) {
    return fetchCacheProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchLazy(TQProperty<QAsiakas>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocAsiakas(String name, R root) {
    super(name, root);
  }

  public QAssocAsiakas(String name, R root, String prefix) {
    super(name, root, prefix);
  }
}
