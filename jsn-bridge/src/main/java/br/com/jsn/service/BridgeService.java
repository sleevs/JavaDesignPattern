package br.com.jsn.service;

import br.com.jsn.bridge.Abstraction;
import br.com.jsn.bridge.ConcreteImplementationA;
import br.com.jsn.bridge.ImplementationIF;
import br.com.jsn.bridge.RefinedAbstraction;

public class BridgeService {
	
	
	
	public static void main(String args []) {
		
		ImplementationIF impl = new ConcreteImplementationA();
		Abstraction abs = new RefinedAbstraction(impl);
		
		abs.feactureA();
		
		System.out.print("\n");
		
		abs.feactureB();				
			
	}

}
