package br.com.jsn.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	
	
	List<Component> listComponent = new ArrayList<>();
	
	public  void add(Component c) {
			
		this.listComponent.add(c);
	
	}
	
	public  void remove(Component c) {
		
		this.listComponent.remove(c);
		
	}
	
	public   boolean isComponent() {
		
		return true ;
	}
	
	@Override
	public void operaion() {
		
		for(Component c : listComponent) {
			
			System.out.println( "  TREE OPERATIONS ()   "   );
			
			c.operaion()  ;
		
	}
	}
		
		

}
