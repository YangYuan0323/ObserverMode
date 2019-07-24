package com.main.pullmode;

public class ConcreteSubject extends Subject {
	private String info;
	
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public void change(String info){
		this.info = info;
		System.out.println("����״̬Ϊ��" + info);
		this.notifyObservers();
	}
}
