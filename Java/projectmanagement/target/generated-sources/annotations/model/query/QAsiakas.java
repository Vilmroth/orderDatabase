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
import model.Asiakas;

/**
 * Query bean for Asiakas.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QAsiakas extends TQRootBean<Asiakas,QAsiakas> {

  private static final QAsiakas _alias = new QAsiakas(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QAsiakas alias() {
    return _alias;
  }

  public PInteger<QAsiakas> customerid;
  public PString<QAsiakas> company;
  public PString<QAsiakas> forename;
  public PString<QAsiakas> surname;
  public PString<QAsiakas> address;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QAsiakas forFetchGroup() {
    return new QAsiakas(FetchGroup.queryFor(Asiakas.class));
  }

  /**
   * Construct using the default Database.
   */
  public QAsiakas() {
    super(Asiakas.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QAsiakas(Transaction transaction) {
    super(Asiakas.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QAsiakas(Database database) {
    super(Asiakas.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QAsiakas(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QAsiakas(Query<Asiakas> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PInteger<QAsiakas> customerid = _alias.customerid;
    public static PString<QAsiakas> company = _alias.company;
    public static PString<QAsiakas> forename = _alias.forename;
    public static PString<QAsiakas> surname = _alias.surname;
    public static PString<QAsiakas> address = _alias.address;
  }
}
