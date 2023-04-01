package br.com.jsn.bridge;

public class ConcreteImplementationA extends ImplementationIF{

	@Override
	public String method1() {
		System.out.println(" ConcreteImplementationA METHOD1() ");
		return " ConcreteImplementationA METHOD1() ";
	}

	@Override
	public String method2() {
		System.out.println(" ConcreteImplementationA METHOD2() ");
		return " ConcreteImplementationA METHOD2()" ;
	}

}
