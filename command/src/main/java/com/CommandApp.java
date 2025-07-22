package com;

import com.impl.ApplyDiscount;
import com.impl.PrintProduct;
import com.impl.SendEmailTask;
import com.impl.SuperTask;
import com.inter.Command;
import com.model.Product;

public class CommandApp {
  public static void main(String[] args) {
    Product p1 = new Product(100, "toy");
    Product p2 = new Product(400, "food");

    Command task1 = new ApplyDiscount();
    Command task2 = new SendEmailTask();
    SuperTask task3 = new SuperTask();

    task3.addTask( task1 );
    task3.addTask( task2 );

    task3.execute( p1 );
  }
}
