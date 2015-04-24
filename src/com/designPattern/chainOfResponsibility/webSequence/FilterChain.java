 package com.designPattern.chainOfResponsibility.webSequence;

import java.util.ArrayList;
import java.util.List;
 public class FilterChain implements Filter {

	 private List<Filter> filters = new ArrayList<Filter>();
	 private int index = 0;
	 
	 public FilterChain addFilter(Filter filter) {
		 this.filters.add(filter);
		 return this;
	 }
	 
	 public FilterChain removeFilter(Filter filter) {
		 this.filters.remove(filter);
		 return this;
	 }

	@Override
	public void doFilter(Request request, Response response,FilterChain filterChain) {
		
		if (index == filters.size()) return;
		Filter filter = filters.get(index);
		index ++;
		filter.doFilter(request, response,filterChain);
		

	}

}

 