package br.com.jsn.service;

import org.springframework.stereotype.Service;

import br.com.jsn.adapter.Adaptee;
import br.com.jsn.adapter.Adapter;
import br.com.jsn.adapter.Target;

//@Service
public class AdapterService {
	
	
	
	

	public static void main(String args []) {
		
		System.out.println("TESTE ");
		
		Target target = new Target();
		Adaptee adaptee = new Adaptee();
		Adapter adapter = new Adapter(adaptee);
		
		
		
		System.out.println(target.operation());
		
	//	adaptee.specificRequest();
		System.out.println(adaptee.specificRequest());
		adapter.operation();
		
		
		System.out.println(adaptee.specificRequest());
		
	}

}
