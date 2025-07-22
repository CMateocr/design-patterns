package com.impl;

import com.inter.Command;
import com.model.Product;

import java.util.ArrayList;
import java.util.List;

public class SuperTask implements Command {

  private List<Command> tasks = new ArrayList<>();

  public void addTask(Command task) {
    tasks.add( task );
  }

  public void removeTask(Command task) {
    tasks.remove( task );
  }

  @Override
  public void execute(Product p) {
    tasks.forEach(task -> task.execute( p ));
  }
}
