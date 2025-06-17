package com;

import com.impl.PrintProductTask;
import com.impl.SendEmailTask;
import com.impl.SuperTask;
import com.impl.ValidateProductTask;
import com.inter.ProductTask;
import com.model.Product;
import com.model.TaskManager;

public class Main {
  public static void main(String[] args) {
    ProductTask email = new SendEmailTask();
    ProductTask validate = new ValidateProductTask();
    ProductTask print = new PrintProductTask();

    SuperTask composite = new SuperTask();

    composite.addTask( email );
    composite.addTask( validate );
    composite.addTask( print );

    TaskManager manager = new TaskManager();
    manager.execute( composite, new Product("Toy", 125.5));

  }
}