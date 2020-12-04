package model.query.assoc;

import io.ebean.Transaction;
import io.ebean.typequery.PBigDecimal;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PUtilDate;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;
import model.ProjectEmployee;
import model.query.QProjectEmployee;

/**
 * Association query bean for AssocProjectEmployee.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean("v1")
public class QAssocProjectEmployee<R> extends TQAssocBean<ProjectEmployee,R> {

  public PLong<R> id;
  public PUtilDate<R> added;
  public PBigDecimal<R> salary;
  public QAssocProject<R> project;
  public QAssocEmployee<R> employee;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetch(TQProperty<QProjectEmployee>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchQuery(TQProperty<QProjectEmployee>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchCache(TQProperty<QProjectEmployee>... properties) {
    return fetchCacheProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchLazy(TQProperty<QProjectEmployee>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocProjectEmployee(String name, R root) {
    super(name, root);
  }

  public QAssocProjectEmployee(String name, R root, String prefix) {
    super(name, root, prefix);
  }
}
