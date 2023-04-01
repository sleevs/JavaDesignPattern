package br.com.jsn.decorator;

public class Decorator extends Component{
	
	
	private Component component ;

	
	public Decorator(Component component) {
		
		this.component = component ;
	}
	
	@Override
	public void operation() {
		
		System.out.println(" Decorator"  );
		
		
	}

}
