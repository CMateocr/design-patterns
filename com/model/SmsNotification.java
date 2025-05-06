package org.com.model;

import org.com.anotation.Component;
import org.com.inter.INotification;

@Component(value = "sms")
public class SmsNotification extends NotificationDecorator{

  public SmsNotification() {
    super(new PushNotifcation());
  }

  public SmsNotification(INotification notification) {
    super(notification);
  }

  private void smsSend(String msg) {
    System.out.println(msg);
  }

  public void send(String msg) {
    super.send(msg);
    smsSend(msg);
  }
}
