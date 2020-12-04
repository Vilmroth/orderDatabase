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
import model.Storage;

/**
 * Query bean for Storage.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QStorage extends TQRootBean<Storage,QStorage> {

  private static final QStorage _alias = new QStorage(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QStorage alias() {
    return _alias;
  }

  public PInteger<QStorage> storagelocation;
  public PInteger<QStorage> capacity;
  public PString<QStorage> productname;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QStorage forFetchGroup() {
    return new QStorage(FetchGroup.queryFor(Storage.class));
  }

  /**
   * Construct using the default Database.
   */
  public QStorage() {
    super(Storage.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QStorage(Transaction transaction) {
    super(Storage.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QStorage(Database database) {
    super(Storage.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QStorage(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QStorage(Query<Storage> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PInteger<QStorage> storagelocation = _alias.storagelocation;
    public static PInteger<QStorage> capacity = _alias.capacity;
    public static PString<QStorage> productname = _alias.productname;
  }
}
