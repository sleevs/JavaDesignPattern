package br.com.jsn.adapter;

public class Adapter extends Target{
	
	private Adaptee adaptee ;
	
	public Adapter(Adaptee adaptee) {
	this.adaptee = adaptee ;
		
	}
	
	public String operation() {
		return this.adaptee.specificRequest();
	}

}
