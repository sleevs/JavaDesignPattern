package br.com.jsn;

import br.com.jsn.creator.ConcreteError;
import br.com.jsn.creator.ConcreteInfo;
import br.com.jsn.creator.Creator;
import br.com.jsn.product.ProductError;
import br.com.jsn.product.ProductInfo;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);

		Creator creator1 = new ConcreteInfo();
		System.out.println(creator1.operation());

		Creator creator2 = new ConcreteError();
		System.out.println(creator2.operation());

	}

}
