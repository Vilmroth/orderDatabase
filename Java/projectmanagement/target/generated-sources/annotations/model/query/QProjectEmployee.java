package model.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.Transaction;
import io.ebean.typequery.PBigDecimal;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PUtilDate;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import model.ProjectEmployee;
import model.query.assoc.QAssocEmployee;
import model.query.assoc.QAssocProject;

/**
 * Query bean for ProjectEmployee.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean("v1")
public class QProjectEmployee extends TQRootBean<ProjectEmployee,QProjectEmployee> {

  private static final QProjectEmployee _alias = new QProjectEmployee(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QProjectEmployee alias() {
    return _alias;
  }

  public PLong<QProjectEmployee> id;
  public PUtilDate<QProjectEmployee> added;
  public PBigDecimal<QProjectEmployee> salary;
  public QAssocProject<QProjectEmployee> project;
  public QAssocEmployee<QProjectEmployee> employee;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QProjectEmployee forFetchGroup() {
    return new QProjectEmployee(FetchGroup.queryFor(ProjectEmployee.class));
  }

  /**
   * Construct using the default Database.
   */
  public QProjectEmployee() {
    super(ProjectEmployee.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QProjectEmployee(Transaction transaction) {
    super(ProjectEmployee.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QProjectEmployee(Database database) {
    super(ProjectEmployee.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QProjectEmployee(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QProjectEmployee(Query<ProjectEmployee> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PLong<QProjectEmployee> id = _alias.id;
    public static PUtilDate<QProjectEmployee> added = _alias.added;
    public static PBigDecimal<QProjectEmployee> salary = _alias.salary;
    public static QAssocProject<QProjectEmployee> project = _alias.project;
    public static QAssocEmployee<QProjectEmployee> employee = _alias.employee;
  }
}
