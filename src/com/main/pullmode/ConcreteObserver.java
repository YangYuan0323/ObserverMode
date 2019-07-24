package com.main.pullmode;

public class ConcreteObserver implements Observer {

	public void update(Subject subject) {
		 System.out.println("¹Û²ìÕß2×´Ì¬Îª£º"+((ConcreteSubject)subject).getInfo());

	}

}
