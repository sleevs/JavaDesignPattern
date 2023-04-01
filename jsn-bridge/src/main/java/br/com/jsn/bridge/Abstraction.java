package br.com.jsn.bridge;

public abstract class Abstraction {

	public ImplementationIF implementationIF;
	
	public Abstraction(ImplementationIF implementationIF) {
		this.implementationIF = implementationIF ;
	}
	
	public String feactureA() {
	//	implementationIF.method1() ;
		return implementationIF.method1() ; 
	}
	
	public String feactureB() {
	//	implementationIF.method2() ;
		return implementationIF.method2();
	}
	
	
}
