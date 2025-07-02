package com.impl;

import com.inter.IMediator;
import com.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Chat implements IMediator {
  private List<User> users = new ArrayList<>();
  private Lock lock = new ReentrantLock();

  @Override
  public void sendMessage(String message, User user) {
    lock.lock();
    try {
      for (User u : users) {
        if (u != user) {
          u.receive(message);
        }
      }
    } finally {
      lock.unlock();
    }
  }

  @Override
  public void addUser(User user) {
    users.add(user);
  }
}
