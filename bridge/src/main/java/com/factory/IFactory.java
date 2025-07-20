package com.factory;

import com.inter.IColor;

import java.util.HashMap;

public interface IFactory {
  void init();
  <T> T create(Class<?> clazz);
  <T> T create(Class<?> clazz, IColor color);
}
