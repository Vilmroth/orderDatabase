package model.query.assoc;

import io.ebean.Transaction;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;
import model.Work;
import model.query.QWork;

/**
 * Association query bean for AssocWork.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean("v1")
public class QAssocWork<R> extends TQAssocBean<Work,R> {

  public PLong<R> workId;
  public QAssocProject<R> project;
  public PString<R> description;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetch(TQProperty<QWork>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchQuery(TQProperty<QWork>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchCache(TQProperty<QWork>... properties) {
    return fetchCacheProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchLazy(TQProperty<QWork>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocWork(String name, R root) {
    super(name, root);
  }

  public QAssocWork(String name, R root, String prefix) {
    super(name, root, prefix);
  }
}
