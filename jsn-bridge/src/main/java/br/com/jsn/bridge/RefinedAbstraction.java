package br.com.jsn.bridge;

public class RefinedAbstraction extends Abstraction{

	public RefinedAbstraction(ImplementationIF implementationIF) {
		super(implementationIF);
		// TODO Auto-generated constructor stub
	}
	
	public String feactureA() {
		
		
		System.out.print("RefinedAsbtraction - feactureA " + implementationIF.method1());
		return null;
	}
	
	

	public String feactureB() {
		
		System.out.print("RefinedAsbtraction - feactureB");
		return null ;
	}


}
