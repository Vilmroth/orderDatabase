package model.query.assoc;

import io.ebean.Transaction;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PString;
import io.ebean.typequery.PUtilDate;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;
import model.Project;
import model.query.QProject;

/**
 * Association query bean for AssocProject.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean("v1")
public class QAssocProject<R> extends TQAssocBean<Project,R> {

  public PInteger<R> projectId;
  public PUtilDate<R> begins;
  public PUtilDate<R> ends;
  public PString<R> name;
  public PString<R> customer;
  public QAssocEmployee<R> projectManager;
  public PString<R> state;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetch(TQProperty<QProject>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchQuery(TQProperty<QProject>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchCache(TQProperty<QProject>... properties) {
    return fetchCacheProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchLazy(TQProperty<QProject>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocProject(String name, R root) {
    super(name, root);
  }

  public QAssocProject(String name, R root, String prefix) {
    super(name, root, prefix);
  }
}
