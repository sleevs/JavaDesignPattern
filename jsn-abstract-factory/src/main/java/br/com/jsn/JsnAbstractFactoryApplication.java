package br.com.jsn;

import br.com.jsn.factory.AbstractFactory;
import br.com.jsn.factory.ConcreteFactoryBoleto;
import br.com.jsn.factory.ConcreteFactoryCreditCard;
import br.com.jsn.product.AbstractProductPayment;

import java.math.BigDecimal;

//@SpringBootApplication
public class JsnAbstractFactoryApplication {

	public static void main(String[] args) {

		//SpringApplication.run(JsnAbstractFactoryApplication.class, args);

		AbstractFactory factory = new ConcreteFactoryBoleto();
		AbstractFactory factory2 = new ConcreteFactoryCreditCard();
		AbstractProductPayment paymentBoleto = factory.createPayment();

		Double value = 2.500 ;
		paymentBoleto.payment(value);



		System.out.println("COMPROVANTE GERADO");
	}


}
