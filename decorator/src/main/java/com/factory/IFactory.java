package com.factory;

public interface IFactory {
  void init(String packageName);
  <T> T create(Class<?> clazz);
}
