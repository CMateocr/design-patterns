package com.model;

import com.inter.IMediator;

public class ConcreteUser extends User{

  public ConcreteUser(String name, IMediator mediator) {
    super(name, mediator);
  }

  @Override
  public void send(String message) {
    System.out.println(name + " sends: " + message);
    mediator.sendMessage(message, this);
  }

  @Override
  public void receive(String message) {
    System.out.println(name + " receives: " + message);
  }
}
