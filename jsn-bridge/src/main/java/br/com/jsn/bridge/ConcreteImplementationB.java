package br.com.jsn.bridge;

public class ConcreteImplementationB extends ImplementationIF{

	private String operaionExtra = "OPERATION IN B" ;

	@Override
	public String method1() {
		System.out.println(" ConcreteImplementationB METHOD1() MULTIPLY : " + operaionExtra);
		return  "ConcreteImplementationB METHOD1() MULTIPLY : " + operaionExtra;
	}

	@Override
	public String method2() {
		System.out.println(" ConcreteImplementationB METHOD2() ADD : " + operaionExtra);
		return " ConcreteImplementationB METHOD2() ADD : " + operaionExtra;
	}

}
