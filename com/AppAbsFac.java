package com;

import com.config.ConfigLoader;
import com.gen.AbstractFactoryLoader;
import com.inter.IUIFactory;
import com.model.App;

public class AppAbsFac {
	public static void main(String[] args) {
		ConfigLoader configService = new ConfigLoader("config.properties");
		
		String theme = configService.get("THEME");
		
		AbstractFactoryLoader loader = new AbstractFactoryLoader();
		
		loader.init("com.impl");
		
		IUIFactory factory = loader.createFactory(theme);
		
		App app = new App(factory);
		
		app.execute();
	}
}
