package com.impl;

import com.inter.INotification;

public class Notification implements INotification {
  @Override
  public void send(String msg) {
    System.out.println(msg);
  }
}
