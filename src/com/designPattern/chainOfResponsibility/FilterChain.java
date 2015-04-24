 package com.designPattern.chainOfResponsibility;

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
	public String doFilter(String msg) {
		
		String result = msg;
		
		for (Filter filter : filters) {
			result = filter.doFilter(result);
		}
		
		return result;

	}

}

 