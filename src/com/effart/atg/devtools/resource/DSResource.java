package com.effart.atg.devtools.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import atg.nucleus.Nucleus;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.ServletUtil;

import com.effart.atg.devtools.domain.DSResponse;
import com.effart.atg.devtools.service.DSService;

@Path("/ds")
@Produces("application/json")
public class DSResource {

	@GET
	@Path("")
	public Object handleQuery() {
		// retrieve dynamo request
		DynamoHttpServletRequest request = ServletUtil.getCurrentRequest();
		// handler datasource request
		DSResponse response = getSmartGwtService().handleRequest(request);
		// wrap response
		ResponseWrapper wrapper = new ResponseWrapper();
		wrapper.setResponse(response);
		return wrapper;
	}
	
	/**
	 * 
	 * @return
	 */
	public DSService getSmartGwtService() {
		DSService service = (DSService)Nucleus.getGlobalNucleus()
				.resolveName("/com/effart/atg/devtools/service/DSService");
		return service;
	}
	
	class ResponseWrapper {
		private DSResponse response;

		/**
		 * @return the response
		 */
		public DSResponse getResponse() {
			return response;
		}

		/**
		 * @param response the response to set
		 */
		public void setResponse(DSResponse response) {
			this.response = response;
		}
	}
}
