package com.factory;

public interface IFactoryDos {
	public <T> T crearte(String name);
	public void init(String pkgName);
}
