package com.inter;

public interface IObservable {
  void register(IObserver observer);
  void unregister(IObserver observer);

  void notifyObserver();
  <T> void execute(T value);
}
