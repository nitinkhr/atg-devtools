package com.effart.atg.devtools.client;

import com.effart.atg.devtools.client.ds.RepositoriesDataSource;
import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.widgets.grid.ListGrid;

public class RepositoryesView {

	public void load() {

		final DataSource repositoriesDs = new RepositoriesDataSource();

		ListGrid grid = new ListGrid();
		grid.setDataSource(repositoriesDs);
		grid.setWidth100();
		grid.setHeight(150);
		grid.setAutoFetchData(true);
		grid.draw();
	}

}
