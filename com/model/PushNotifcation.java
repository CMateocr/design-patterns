package org.com.model;

import org.com.anotation.Component;
import org.com.base.NotificationImpl;
import org.com.inter.INotification;

@Component(value = "push")
public class PushNotifcation extends NotificationDecorator{

  public PushNotifcation() {
    super(new NotificationImpl());
  }

  public PushNotifcation(INotification notification) {
    super(notification);
  }

  private void pushSend(String msg) {
    System.out.println(msg);
  }

  public void send(String msg) {
    super.send(msg);
    pushSend("desde push: " + msg);
  }
}
