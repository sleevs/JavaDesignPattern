package br.com.jsn;

import br.com.jsn.creator.Creator;
import br.com.jsn.creator.ConcreteCreatorBike;
import br.com.jsn.creator.ConcreteCreatorCar;
import br.com.jsn.creator.ConcreteCreatorMotorcycle;
import br.com.jsn.creator.ConcreteCreatorTruck;
import br.com.jsn.model.Address;
import br.com.jsn.model.CoordinateModel;
import br.com.jsn.model.GeocodeModel;
import br.com.jsn.service.ShippingCalculator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


		/*
		DemoApplication demoApplication = new DemoApplication();

		ShippingCalculator shippingCalculator = new ShippingCalculator();
		Creator creator1 ;



		System.out.println("\n");
		System.out.println("\n");





		CoordinateModel o = demoApplication.getCoord("rua oito bras de pina");
		CoordinateModel d = demoApplication.getCoord("rua nicaragua penha");



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


		 */

	}










}






