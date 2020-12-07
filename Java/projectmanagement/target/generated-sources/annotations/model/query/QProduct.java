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
import model.Product;

/**
 * Query bean for Product.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QProduct extends TQRootBean<Product,QProduct> {

  private static final QProduct _alias = new QProduct(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QProduct alias() {
    return _alias;
  }

  public PInteger<QProduct> productId;
  public PString<QProduct> productName;
  public PInteger<QProduct> price;
  public PInteger<QProduct> size;
  public PInteger<QProduct> weight;
  public PInteger<QProduct> storageLocation;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QProduct forFetchGroup() {
    return new QProduct(FetchGroup.queryFor(Product.class));
  }

  /**
   * Construct using the default Database.
   */
  public QProduct() {
    super(Product.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QProduct(Transaction transaction) {
    super(Product.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QProduct(Database database) {
    super(Product.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QProduct(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QProduct(Query<Product> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PInteger<QProduct> productId = _alias.productId;
    public static PString<QProduct> productName = _alias.productName;
    public static PInteger<QProduct> price = _alias.price;
    public static PInteger<QProduct> size = _alias.size;
    public static PInteger<QProduct> weight = _alias.weight;
    public static PInteger<QProduct> storageLocation = _alias.storageLocation;
  }
}
