package br.com.jsn;

import br.com.jsn.creator.Creator;
import br.com.jsn.creator.ConcreteCreatorBike;
import br.com.jsn.creator.ConcreteCreatorCar;
import br.com.jsn.creator.ConcreteCreatorMotorcycle;
import br.com.jsn.creator.ConcreteCreatorTruck;
import br.com.jsn.model.CoordinateModel;
import br.com.jsn.service.ShippingCalculator;
import org.springframework.beans.factory.annotation.Autowired;

//@SpringBootApplication
public class DemoApplication {



	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);

		ShippingCalculator shippingCalculator = new ShippingCalculator();
		Creator creator1 ;
		


		CoordinateModel o = new CoordinateModel() ;
		CoordinateModel d = new CoordinateModel() ;


		double latBras = -22.8333 ;
		double lonBras = -43.2833322 ;

		double latPenha = -22.8354 ;
		double lonPenha = -43.2733 ;


		o.setLat(-22.8333);
		o.setLon(-43.2833322);

		d.setLat(-22.8354);
		d.setLon(-43.2733);
		 creator1 = new ConcreteCreatorBike();
		 System.out.println(creator1.operation(o , d));
		
		 creator1 = new ConcreteCreatorMotorcycle();
		 System.out.println(creator1.operation(o , d));
		
		 creator1 = new ConcreteCreatorCar();
		 System.out.println(creator1.operation(o , d));
		
		 creator1 = new ConcreteCreatorTruck();
		 System.out.println(creator1.operation(o , d));



		System.out.println("==============calculo ========\n");
		System.out.println(shippingCalculator.calcularDistancia(o, d));

	}








}
