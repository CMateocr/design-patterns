package org.com.model;

import org.com.inter.INotification;

public abstract class NotificationDecorator implements INotification {

  protected INotification notification;

  public NotificationDecorator(INotification notification) {
    this.notification = notification;
  }

  @Override
  public void send(String msg) {
    notification.send("desde decorador: " + msg);
  }

}
