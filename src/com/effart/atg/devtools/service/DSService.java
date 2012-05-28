package com.effart.atg.devtools.service;

import java.util.Collection;

import atg.nucleus.ServiceMap;
import atg.servlet.DynamoHttpServletRequest;

import com.effart.atg.devtools.DevToolsGenericService;
import com.effart.atg.devtools.datasource.ADataSource;
import com.effart.atg.devtools.domain.DSResponse;
import com.effart.atg.devtools.domain.DataFormat;
import com.effart.atg.devtools.domain.OperationType;
import com.effart.atg.devtools.domain.DSRequest;
import com.effart.atg.devtools.domain.ResponseStatus;
import com.effart.atg.devtools.domain.TextMatchStyle;
import com.effart.atg.devtools.domain.exception.DevToolsException;

public class DSService extends DevToolsGenericService {
	
	private ServiceMap datasources;
	
	public DSResponse handleRequest(DynamoHttpServletRequest dynamoRequest) {
		DSRequest dsRequest = parseQuery(dynamoRequest);
		ADataSource dataSource = (ADataSource)datasources.get(dsRequest.getDataSourceId());
		
		ResponseStatus status;
		Collection<?> data = null;
		try {
			if (dataSource == null) {
				throw  new DevToolsException("DataSource handler wasn'tfound for " + dsRequest.getDataSourceId());
			}
			data = dataSource.handleRequest(dsRequest);
			status = ResponseStatus.success;
		}
		catch(DevToolsException ex) {
			if  (isLoggingError()) {
				logError("failed to handle datasource request " + dsRequest, ex);
			}
			status = ResponseStatus.failure;
		}
		
		// create response
		DSResponse dsResponse = new DSResponse();
		dsResponse.setStatus(status.getCode());
		if (status == ResponseStatus.success && data != null) {
			dsResponse.setData(data);
			dsResponse.setTotalRows(data.size());
			dsResponse.setStartRow(dsRequest.getStartRow() == null ? 0 : dsRequest.getStartRow());
			dsResponse.setEndRow(data.size());
		}
		
		return dsResponse;
	}

	
	/**
	__gwt_ObjectId=201
	_operationType=fetch
	_startRow=0
	_endRow=75
	_textMatchStyle=startsWith
	_componentId=isc_PickListMenu_0
	_dataSource=repositoriesDs
	isc_metaDataPrefix=_
	isc_dataFormat=json
	 */
	public DSRequest parseQuery(DynamoHttpServletRequest dynamoRequest) {
		DSRequest dsRequest = new DSRequest();
		// operation type is mandatory
		dsRequest.setOperationType(OperationType.valueOf(
				dynamoRequest.getParameter("_operationType")));
		// datasource is mandatory param
		dsRequest.setDataSourceId(
				dynamoRequest.getParameter("_dataSource"));
		// start row
		String v = dynamoRequest.getParameter("_startRow");
		if (v != null) {
			dsRequest.setStartRow(Integer.valueOf(v));
		}
		// end row
		v = dynamoRequest.getParameter("_endRow");
		if (v != null) {
			dsRequest.setEndRow(Integer.valueOf(v));
		}
		// text match style
		v = dynamoRequest.getParameter("_textMatchStyle");
		if (v != null) {
			dsRequest.setTextMatchStyle(TextMatchStyle.valueOf(v));
		}
		// component id
		v = dynamoRequest.getParameter("_componentId");
		if (v != null) {
			dsRequest.setComponentId(v);
		}
		// gwt object id
		v = dynamoRequest.getParameter("__gwt_ObjectId");
		if (v != null) {
			dsRequest.setGwtObjectId(v);
		}
		// data format
		v = dynamoRequest.getParameter("isc_dataFormat");
		if (v != null) {
			dsRequest.setDataFormat(DataFormat.valueOf(v));
		}
		// meta data preffix
		v = dynamoRequest.getParameter("isc_metaDataPrefix");
		if (v != null) {
			dsRequest.setMetaDataPrefix(v);
		}
		return dsRequest;
	}

	/**
	 * @return the datasources
	 */
	public ServiceMap getDatasources() {
		return datasources;
	}

	/**
	 * @param datasources the datasources to set
	 */
	public void setDatasources(ServiceMap datasources) {
		this.datasources = datasources;
	}
}
