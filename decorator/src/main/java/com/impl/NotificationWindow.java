package com.impl;

import com.inter.INotification;

public class NotificationWindow extends NotificationDecorator{

  public NotificationWindow(INotification notification) {
    super(notification);
  }

  @Override
  public void send(String msg) {
    super.send( msg );
    System.out.println("desde window " + msg);
  }
}
