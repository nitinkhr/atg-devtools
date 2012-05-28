package com.effart.atg.devtools.domain;

import java.util.Collection;

/**
 * 
 * @author Oleksandr_Minaiev
 *
 */
public class DSResponse {
	  private int status;
	  private Collection<?> data;
	  private Integer startRow;
	  private Integer endRow;
	  private Integer totalRows;
	  
	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}
	
	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the data
	 */
	public Collection<?> getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Collection<?> data) {
		this.data = data;
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
	 * @return the totalRows
	 */
	public Integer getTotalRows() {
		return totalRows;
	}

	/**
	 * @param totalRows the totalRows to set
	 */
	public void setTotalRows(Integer totalRows) {
		this.totalRows = totalRows;
	}
}
