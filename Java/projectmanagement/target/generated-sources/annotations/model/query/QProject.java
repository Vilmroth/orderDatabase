package model.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.Transaction;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PString;
import io.ebean.typequery.PUtilDate;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import model.Project;
import model.query.assoc.QAssocEmployee;

/**
 * Query bean for Project.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QProject extends TQRootBean<Project,QProject> {

  private static final QProject _alias = new QProject(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QProject alias() {
    return _alias;
  }

  public PInteger<QProject> projectId;
  public PUtilDate<QProject> begins;
  public PUtilDate<QProject> ends;
  public PString<QProject> name;
  public PString<QProject> customer;
  public QAssocEmployee<QProject> projectManager;
  public PString<QProject> state;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QProject forFetchGroup() {
    return new QProject(FetchGroup.queryFor(Project.class));
  }

  /**
   * Construct using the default Database.
   */
  public QProject() {
    super(Project.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QProject(Transaction transaction) {
    super(Project.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QProject(Database database) {
    super(Project.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QProject(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QProject(Query<Project> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PInteger<QProject> projectId = _alias.projectId;
    public static PUtilDate<QProject> begins = _alias.begins;
    public static PUtilDate<QProject> ends = _alias.ends;
    public static PString<QProject> name = _alias.name;
    public static PString<QProject> customer = _alias.customer;
    public static QAssocEmployee<QProject> projectManager = _alias.projectManager;
    public static PString<QProject> state = _alias.state;
  }
}
