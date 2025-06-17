package com.impl;

import com.inter.ProductTask;
import com.model.Product;

import java.util.ArrayList;
import java.util.List;

public class SuperTask implements ProductTask {
  private List<ProductTask> tasks = new ArrayList<>();

  public void addTask(ProductTask task) {
    tasks.add( task );
  }

  public void remove(ProductTask task) {
    tasks.remove( task );
  }

  @Override
  public void execute(Product product) {
    tasks.forEach(t -> t.execute( product ));
  }
}
