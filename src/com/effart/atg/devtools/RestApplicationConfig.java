package com.effart.atg.devtools;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.effart.atg.devtools.resource.DSResource;

public class RestApplicationConfig extends Application {

	private Set<Object> singletons;
	
	public RestApplicationConfig() {
		singletons = new HashSet<Object>();
		singletons.add(new DSResource());
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		return new HashSet<Class<?>>();
	}
	
	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
