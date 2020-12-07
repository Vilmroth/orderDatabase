package model.query.assoc;

import io.ebean.Transaction;
import io.ebean.typequery.PBigDecimal;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.PUtilDate;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import model.Expense;
import model.query.QExpense;

/**
 * Association query bean for AssocExpense.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QAssocExpense<R> extends TQAssocBean<Expense,R> {

  public PLong<R> expenseId;
  public PString<R> state;
  public PString<R> description;
  public PUtilDate<R> dte;
  public PBigDecimal<R> sum;
  public QAssocWork<R> work;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetch(TQProperty<QExpense>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchQuery(TQProperty<QExpense>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchCache(TQProperty<QExpense>... properties) {
    return fetchCacheProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchLazy(TQProperty<QExpense>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocExpense(String name, R root) {
    super(name, root);
  }

  public QAssocExpense(String name, R root, String prefix) {
    super(name, root, prefix);
  }
}
