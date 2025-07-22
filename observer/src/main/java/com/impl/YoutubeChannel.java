package com.impl;

import com.inter.IObservable;
import com.inter.IObserver;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements IObservable {
  private String lastVideoTitle = "";
  private List<IObserver> subscribers = new ArrayList<>();

  @Override
  public void register(IObserver observer) {
    subscribers.add( observer );
  }

  @Override
  public void unregister(IObserver observer) {
    subscribers.remove( observer );
  }

  @Override
  public void notifyObserver() {
    subscribers.forEach(IObserver::update);
  }

  @Override
  public <T> void execute(T value) {
    this.lastVideoTitle = (String) value;
    notifyObserver();
  }
}
