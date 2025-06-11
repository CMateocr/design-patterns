package com.inter;

public interface IIterator {
  void first();
  String next();
  boolean isDone();
  String currentItem();
}
