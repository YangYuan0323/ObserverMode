package com.main.pullmode;

import java.util.ArrayList;
import java.util.List;


public abstract class Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer observer){
		observers.add(observer);
		 System.out.println("你添加了一个观察者:"+observer);
	}
	
	public void dettach(Observer observer){
		if(null != observers){
			observers.remove(observer);
		}
	}
	
	public void notifyObservers(){
		for (Observer observer : observers) {
			observer.update(this);
		}
	}


}
