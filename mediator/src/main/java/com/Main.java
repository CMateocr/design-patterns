package com;

import com.impl.Chat;
import com.inter.IMediator;
import com.model.ConcreteUser;
import com.model.User;

public class Main {
  public static void main(String[] args) {
    IMediator mediator = new Chat();

    User user1 = new ConcreteUser("Alice", mediator);
    User user2 = new ConcreteUser("Bob", mediator);
    User user3 = new ConcreteUser("Charlie", mediator);
    User user4 = new ConcreteUser("Diana", mediator);
    User user5 = new ConcreteUser("Eve", mediator);

    mediator.addUser(user1);
    mediator.addUser(user2);
    mediator.addUser(user3);
    mediator.addUser(user4);
    mediator.addUser(user5);

    user1.send("Hello everyone!");
    user2.send("Hi Alice!");
  }
}