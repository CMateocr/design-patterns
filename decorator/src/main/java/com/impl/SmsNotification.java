package com.impl;

import com.inter.INotification;

public class SmsNotification extends NotificationDecorator{

  public SmsNotification(INotification notification) {
    super(notification);
  }

  @Override
  public void send(String msg) {
    super.send( msg );
    System.out.println("desde sms " + msg);
  }
}
