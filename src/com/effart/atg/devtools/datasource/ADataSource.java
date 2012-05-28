package com.effart.atg.devtools.datasource;

import java.util.Collection;
import java.util.List;

import com.effart.atg.devtools.DevToolsGenericService;
import com.effart.atg.devtools.domain.DSRequest;
import com.effart.atg.devtools.domain.exception.DevToolsException;

public abstract class ADataSource extends DevToolsGenericService {
	private List<String> supportedOperations;
	private String dataSourceId;
	
	public Collection<?> handleRequest(DSRequest request) {
		
		// Check whether ds spports op
		if (request.getOperationType() == null 
				|| supportedOperations == null
				|| !supportedOperations.contains(request.getOperationType().toString())
						) {
			throw new DevToolsException("Unsupported Operation " + request.getOperationType());
		}
		
		switch (request.getOperationType()) {
		case fetch: return doFetch(request);
		case update: return doUpdate(request);
		default: throw new DevToolsException("Unsupported Operation " + request.getOperationType());
		}
	}
	
	protected Collection<?> doFetch(DSRequest request) {
		throw new DevToolsException("doFetch seems to be supported operation, but didn't implement a stub");
	}
	protected Collection<?> doUpdate(DSRequest request) {
		throw new DevToolsException("doUpdate seems to be supported operation, but didn't implement a stub");
	}
	
	/**
	 * @return the dataSourceId
	 */
	public String getDataSourceId() {
		return dataSourceId;
	}
	
	/**
	 * @param dataSourceId the dataSourceId to set
	 */
	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
	}

	/**
	 * @return the supportedOperations
	 */
	public List<String> getSupportedOperations() {
		return supportedOperations;
	}

	/**
	 * @param supportedOperations the supportedOperations to set
	 */
	public void setSupportedOperations(List<String> supportedOperations) {
		this.supportedOperations = supportedOperations;
	}
}
