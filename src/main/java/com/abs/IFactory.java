package com.abs;

public interface IFactory {
	void init(String packageName);
	public <T> T create(Class<T> clazz);
}
