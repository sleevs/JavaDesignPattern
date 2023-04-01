package br.com.jsn.creator;

import br.com.jsn.product.Product;
import br.com.jsn.product.ConcreteProductCar;

public class ConcreteCreatorCar extends Creator{

	@Override
	public Product factoryMethod() {
		// TODO Auto-generated method stub
		return new ConcreteProductCar();
	}

}
