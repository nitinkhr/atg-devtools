package com.effart.atg.devtools.client;

import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class UI implements EntryPoint {
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		new RepositoryesView().load();
	}
}
