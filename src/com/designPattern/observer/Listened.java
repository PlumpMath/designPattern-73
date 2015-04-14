 package com.designPattern.observer;
 public interface Listened {
	 public void addListener(Listener listner);
	 public void removeListener(Listener listner);
	 public void notifyListeners(String str);
}

 