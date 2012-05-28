package com.effart.atg.devtools.domain;

/**
 * 
 * @author Oleksandr_Minaiev
 *
 */
public class DSRequest {
	private String dataSourceId;
	private OperationType operationType;
	private Integer startRow;
	private Integer endRow;
	private TextMatchStyle textMatchStyle;
	private String componentId;
	private String metaDataPrefix;
	private DataFormat dataFormat;
	private String gwtObjectId;
	
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
	 * @return the operationType
	 */
	public OperationType getOperationType() {
		return operationType;
	}

	/**
	 * @param operationType the operationType to set
	 */
	public void setOperationType(OperationType operationType) {
		this.operationType = operationType;
	}

	/**
	 * @return the startRow
	 */
	public Integer getStartRow() {
		return startRow;
	}

	/**
	 * @param startRow the startRow to set
	 */
	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}

	/**
	 * @return the endRow
	 */
	public Integer getEndRow() {
		return endRow;
	}

	/**
	 * @param endRow the endRow to set
	 */
	public void setEndRow(Integer endRow) {
		this.endRow = endRow;
	}

	/**
	 * @return the textMatchStyle
	 */
	public TextMatchStyle getTextMatchStyle() {
		return textMatchStyle;
	}

	/**
	 * @param textMatchStyle the textMatchStyle to set
	 */
	public void setTextMatchStyle(TextMatchStyle textMatchStyle) {
		this.textMatchStyle = textMatchStyle;
	}

	/**
	 * @return the componentId
	 */
	public String getComponentId() {
		return componentId;
	}

	/**
	 * @param componentId the componentId to set
	 */
	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}

	/**
	 * @return the metaDataPrefix
	 */
	public String getMetaDataPrefix() {
		return metaDataPrefix;
	}

	/**
	 * @param metaDataPrefix the metaDataPrefix to set
	 */
	public void setMetaDataPrefix(String metaDataPrefix) {
		this.metaDataPrefix = metaDataPrefix;
	}

	/**
	 * @return the dataFormat
	 */
	public DataFormat getDataFormat() {
		return dataFormat;
	}

	/**
	 * @param dataFormat the dataFormat to set
	 */
	public void setDataFormat(DataFormat dataFormat) {
		this.dataFormat = dataFormat;
	}

	/**
	 * @return the gwtObjectId
	 */
	public String getGwtObjectId() {
		return gwtObjectId;
	}

	/**
	 * @param gwtObjectId the gwtObjectId to set
	 */
	public void setGwtObjectId(String gwtObjectId) {
		this.gwtObjectId = gwtObjectId;
	}
}
