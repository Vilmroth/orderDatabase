package model.query.assoc;

import io.ebean.Transaction;
import io.ebean.typequery.PDouble;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PString;
import io.ebean.typequery.PUtilDate;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;
import model.Employee;
import model.query.QEmployee;

/**
 * Association query bean for AssocEmployee.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean("v1")
public class QAssocEmployee<R> extends TQAssocBean<Employee,R> {

  public PInteger<R> personNo;
  public PString<R> firstName;
  public PString<R> lastName;
  public PUtilDate<R> birthDate;
  public PString<R> title;
  public PString<R> phoneNumber;
  public PDouble<R> age;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetch(TQProperty<QEmployee>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchQuery(TQProperty<QEmployee>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchCache(TQProperty<QEmployee>... properties) {
    return fetchCacheProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchLazy(TQProperty<QEmployee>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocEmployee(String name, R root) {
    super(name, root);
  }

  public QAssocEmployee(String name, R root, String prefix) {
    super(name, root, prefix);
  }
}
