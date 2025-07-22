package com;

import com.impl.Subscriber;
import com.impl.YoutubeChannel;
import com.inter.IObservable;
import com.inter.IObserver;

public class ObserverApp {
  public static void main(String[] args) {
    IObservable channel = new YoutubeChannel();
    IObserver sub = new Subscriber(channel);

    channel.register( sub );

    channel.execute("Nuevo video");
  }
}
