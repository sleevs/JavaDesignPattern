package br.com.jsn.decorator;

public class Demo {

	
	public static void main(String args []) {
		
		
		Component com1 = new ConcreteComponent();
		com1.operation();
		
		System.out.println("\n ");
		Component d1 = new Decorator(com1);
		Component d2 = new ConcreteDecorator(d1);
		
		d2.operation();
	}
}
