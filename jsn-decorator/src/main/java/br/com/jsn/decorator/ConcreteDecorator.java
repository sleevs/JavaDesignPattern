package br.com.jsn.decorator;

public class ConcreteDecorator extends Decorator{
	
	
	private Component component ;

	public ConcreteDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
		
		this.component = component ;
	}
	
	
	public void operation() {
		
		this.component.operation();
		System.out.println("ConcreteDecorator ");
	}

}
 	