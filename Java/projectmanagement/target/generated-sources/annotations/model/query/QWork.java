package model.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.Transaction;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import model.Work;
import model.query.assoc.QAssocProject;

/**
 * Query bean for Work.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean("v1")
public class QWork extends TQRootBean<Work,QWork> {

  private static final QWork _alias = new QWork(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QWork alias() {
    return _alias;
  }

  public PLong<QWork> workId;
  public QAssocProject<QWork> project;
  public PString<QWork> description;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QWork forFetchGroup() {
    return new QWork(FetchGroup.queryFor(Work.class));
  }

  /**
   * Construct using the default Database.
   */
  public QWork() {
    super(Work.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QWork(Transaction transaction) {
    super(Work.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QWork(Database database) {
    super(Work.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QWork(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QWork(Query<Work> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PLong<QWork> workId = _alias.workId;
    public static QAssocProject<QWork> project = _alias.project;
    public static PString<QWork> description = _alias.description;
  }
}
