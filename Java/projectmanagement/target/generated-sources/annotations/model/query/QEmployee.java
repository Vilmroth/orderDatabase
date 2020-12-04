package model.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.Transaction;
import io.ebean.typequery.PDouble;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PString;
import io.ebean.typequery.PUtilDate;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import model.Employee;

/**
 * Query bean for Employee.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QEmployee extends TQRootBean<Employee,QEmployee> {

  private static final QEmployee _alias = new QEmployee(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QEmployee alias() {
    return _alias;
  }

  public PInteger<QEmployee> personNo;
  public PString<QEmployee> firstName;
  public PString<QEmployee> lastName;
  public PUtilDate<QEmployee> birthDate;
  public PString<QEmployee> title;
  public PString<QEmployee> phoneNumber;
  public PDouble<QEmployee> age;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QEmployee forFetchGroup() {
    return new QEmployee(FetchGroup.queryFor(Employee.class));
  }

  /**
   * Construct using the default Database.
   */
  public QEmployee() {
    super(Employee.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QEmployee(Transaction transaction) {
    super(Employee.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QEmployee(Database database) {
    super(Employee.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QEmployee(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QEmployee(Query<Employee> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PInteger<QEmployee> personNo = _alias.personNo;
    public static PString<QEmployee> firstName = _alias.firstName;
    public static PString<QEmployee> lastName = _alias.lastName;
    public static PUtilDate<QEmployee> birthDate = _alias.birthDate;
    public static PString<QEmployee> title = _alias.title;
    public static PString<QEmployee> phoneNumber = _alias.phoneNumber;
    public static PDouble<QEmployee> age = _alias.age;
  }
}
