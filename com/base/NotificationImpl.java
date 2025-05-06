package org.com.base;

import org.com.inter.INotification;

public class NotificationImpl implements INotification {
  @Override
  public void send(String msg) {
    System.out.println("Enviar mensaje con: " + msg);
  }
}
