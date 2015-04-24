 package com.designPattern.chainOfResponsibility.web;

import java.util.ArrayList;
import java.util.List;
 public class FilterChain implements Filter {

	 private List<Filter> filters = new ArrayList<Filter>();
	 
	 public FilterChain addFilter(Filter filter) {
		 this.filters.add(filter);
		 return this;
	 }
	 
	 public FilterChain removeFilter(Filter filter) {
		 this.filters.remove(filter);
		 return this;
	 }

	@Override
	public void doFilter(Request request, Response response) {

		for (Filter filter : filters) {
			filter.doFilter(request, response);
		}
		
	}

}

 