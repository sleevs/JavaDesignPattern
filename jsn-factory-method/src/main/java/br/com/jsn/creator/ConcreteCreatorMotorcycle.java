package br.com.jsn.creator;

import br.com.jsn.product.Product;
import br.com.jsn.product.ConcreteProductMotorcycle;

public class ConcreteCreatorMotorcycle  extends Creator{

	@Override
	public Product factoryMethod() {
		// TODO Auto-generated method stub
		return new ConcreteProductMotorcycle();
	}

}
