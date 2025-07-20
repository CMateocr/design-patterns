package com;

import com.impl.Notification;
import com.impl.NotificationWindow;
import com.impl.SmsNotification;
import com.inter.INotification;

public class DecoratorApp {
  public static void main(String[] args) {
    INotification notification = new Notification();
    INotification notifacionWindow = new NotificationWindow( notification );
    INotification sms = new SmsNotification( notifacionWindow );

    sms.send("hola");
  }
}
