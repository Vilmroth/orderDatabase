package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Generated;

import io.ebean.config.ModuleInfo;
import io.ebean.config.ModuleInfoLoader;

@Generated("io.ebean.querybean.generator")
@ModuleInfo(entities={"model.Customer","model.Delivery","model.Employee","model.Expense","model.Orders","model.Product","model.Project","model.ProjectEmployee","model.Storages","model.Work"})
public class _ebean$ModuleInfo implements ModuleInfoLoader {

  private List<Class<?>> otherClasses() {
    return Collections.emptyList();
  }

  @Override
  public List<Class<?>> entityClasses() {
    List<Class<?>> entities = new ArrayList<>();
    entities.add(model.Customer.class);
    entities.add(model.Delivery.class);
    entities.add(model.Employee.class);
    entities.add(model.Expense.class);
    entities.add(model.Orders.class);
    entities.add(model.Product.class);
    entities.add(model.Project.class);
    entities.add(model.ProjectEmployee.class);
    entities.add(model.Storages.class);
    entities.add(model.Work.class);
    return entities;
  }

  @Override
  public List<Class<?>> entityClassesFor(String dbName) {

    return Collections.emptyList();
  }

}
