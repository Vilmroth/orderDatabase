package model.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.Transaction;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import model.Storages;

/**
 * Query bean for Storages.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QStorages extends TQRootBean<Storages,QStorages> {

  private static final QStorages _alias = new QStorages(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QStorages alias() {
    return _alias;
  }

  public PInteger<QStorages> storagelocation;
  public PInteger<QStorages> capacity;
  public PString<QStorages> productname;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QStorages forFetchGroup() {
    return new QStorages(FetchGroup.queryFor(Storages.class));
  }

  /**
   * Construct using the default Database.
   */
  public QStorages() {
    super(Storages.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QStorages(Transaction transaction) {
    super(Storages.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QStorages(Database database) {
    super(Storages.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QStorages(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QStorages(Query<Storages> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PInteger<QStorages> storagelocation = _alias.storagelocation;
    public static PInteger<QStorages> capacity = _alias.capacity;
    public static PString<QStorages> productname = _alias.productname;
  }
}
