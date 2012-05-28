package com.effart.atg.devtools.client;

public class WebConfig {
	
	private static WebConfig self;
	
	private String dsEndPoint = "/devtools/rest/ds";

	private WebConfig() {
	}
	
	public static WebConfig getInstance() {
		if (self == null) {
			self = new WebConfig();
		}
		return self;
	}

	/**
	 * @return the dsEndPoint
	 */
	public String getDsEndPoint() {
		return dsEndPoint;
	}

	/**
	 * @param dsEndPoint the dsEndPoint to set
	 */
	public void setDsEndPoint(String dsEndPoint) {
		this.dsEndPoint = dsEndPoint;
	}
}
