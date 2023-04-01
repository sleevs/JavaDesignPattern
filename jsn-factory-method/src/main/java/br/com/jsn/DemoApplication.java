package br.com.jsn;

import br.com.jsn.creator.Creator;
import br.com.jsn.creator.ConcreteCreatorBike;
import br.com.jsn.creator.ConcreteCreatorCar;
import br.com.jsn.creator.ConcreteCreatorMotorcycle;
import br.com.jsn.creator.ConcreteCreatorTruck;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		
		
		Creator creator1 ;
		
		String o  = null ;
		String d = null ;
		
		 creator1 = new ConcreteCreatorBike();
		 System.out.println(creator1.operation(o , d));
		
		 creator1 = new ConcreteCreatorMotorcycle();
		 System.out.println(creator1.operation(o , d));
		
		 creator1 = new ConcreteCreatorCar();
		 System.out.println(creator1.operation(o , d));
		
		 creator1 = new ConcreteCreatorTruck();
		 System.out.println(creator1.operation(o , d));
		

	}

}
