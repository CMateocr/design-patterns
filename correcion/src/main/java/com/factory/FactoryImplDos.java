package com.factory;

import java.util.HashMap;
import java.util.Map;

import com.anotaciones.MiAnotacion;
import com.google.common.reflect.ClassPath;


public class FactoryImplDos implements IFactoryDos{
private Map<String , Class> componentes = new HashMap<String, Class>();
	
	@Override
	public void init(String pkgName) {
		System.out.println(" inicia ");
		try {
			
			
			ClassPath classPath = ClassPath.from(FactoryImpl.class.getClassLoader()); 
			var clases = classPath.getTopLevelClassesRecursive(pkgName);
					
			for(var it : clases) {
			
				var miComp = it.load().getAnnotation(MiAnotacion.class);
				
				if(miComp !=null) {
					componentes.put(miComp.name(), it.load());
					System.out.println(miComp.name());
				}
			}
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public <T> T crearte(String name) {
		var value = componentes.get(name);
		if(value == null) {
			throw new RuntimeException("Componente " + name + " no registrado" );
		}
		
		try {
			
			var cto = value.getConstructor();
			Object obj = cto.newInstance();
			return (T) obj;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
