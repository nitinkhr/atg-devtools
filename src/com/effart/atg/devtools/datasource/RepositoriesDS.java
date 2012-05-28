package com.effart.atg.devtools.datasource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.effart.atg.devtools.domain.DSRequest;

/**
 * 
 * @author Oleksandr_Minaiev
 *
 */
public class RepositoriesDS extends ADataSource  {

	@Override
	protected Collection<?> doFetch(DSRequest query) {
		List<ResponseBean> repositoryList = new ArrayList<ResponseBean>();
		ResponseBean bean = new ResponseBean();
		bean.setPath("/atg/userprofiling/ProfileAdapterRepository");
		repositoryList.add(bean);
		return repositoryList;
	}

	public class ResponseBean {
		private String path;

		/**
		 * @return the path
		 */
		public String getPath() {
			return path;
		}

		/**
		 * @param path the path to set
		 */
		public void setPath(String path) {
			this.path = path;
		}
	}
}
