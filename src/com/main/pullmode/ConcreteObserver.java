package com.main.pullmode;

public class ConcreteObserver implements Observer {

	public void update(Subject subject) {
		 System.out.println("�۲���2״̬Ϊ��"+((ConcreteSubject)subject).getInfo());

	}

}
