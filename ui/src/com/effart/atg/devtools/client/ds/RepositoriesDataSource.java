package com.effart.atg.devtools.client.ds;

import com.effart.atg.devtools.client.WebConfig;
import com.smartgwt.client.data.OperationBinding;
import com.smartgwt.client.data.RestDataSource;
import com.smartgwt.client.data.fields.DataSourceTextField;
import com.smartgwt.client.types.DSDataFormat;
import com.smartgwt.client.types.DSOperationType;

public class RepositoriesDataSource extends RestDataSource {

	public RepositoriesDataSource() {
        setID("repositoriesDs");
        setClientOnly(false);
        setDataFormat(DSDataFormat.JSON);
        
        DataSourceTextField repositoryPathField = new DataSourceTextField("path", "Repository Path", 100, true);
        repositoryPathField.setCanEdit(false);
        repositoryPathField.setPrimaryKey(true);
        
        setFields(repositoryPathField);
        
        setOperationBindings(
                new OperationBinding(DSOperationType.FETCH, WebConfig.getInstance().getDsEndPoint()),
                new OperationBinding(DSOperationType.ADD, WebConfig.getInstance().getDsEndPoint()),
                new OperationBinding(DSOperationType.UPDATE, WebConfig.getInstance().getDsEndPoint()),
                new OperationBinding(DSOperationType.REMOVE, WebConfig.getInstance().getDsEndPoint())
        );
        
	}
}
