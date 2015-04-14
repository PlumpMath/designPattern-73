 package com.designPattern.observer;

import java.util.ArrayList;
import java.util.List;
 public class ConcreteListened implements Listened {

	 //存放观察者
	 private List<Listener> list = new ArrayList<Listener>();
	 
	@Override
	public void addListener(Listener watcher) {
		list.add(watcher);
	}

	@Override
	public void removeListener(Listener watcher) {
		list.remove(watcher);
	}

	@Override
	public void notifyListeners(String str) {
		for (Listener watcher : list) {
			watcher.update(str);
		}
	}

}

 