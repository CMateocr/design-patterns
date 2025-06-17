package com.model;

import com.inter.ProductTask;

public class TaskManager {
  public void execute(ProductTask task, Product product) {
    task.execute( product );
  }
}
