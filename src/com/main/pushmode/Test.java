package com.main.pushmode;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		ConcreteObserver observer = new ConcreteObserver();
		subject.attach(observer);
		subject.change("你有新的消息");

	}

}
