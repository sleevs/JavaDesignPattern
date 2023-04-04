package br.com.jsn.product;

import br.com.jsn.model.CoordinateModel;
import br.com.jsn.service.ShippingCalculator;

public class ConcreteProductCar extends Product{

	@Override
	public String action(CoordinateModel o , CoordinateModel d) {


		ShippingCalculator shippingCalculator = new ShippingCalculator();
		double distanceKm = shippingCalculator.calcularDistancia(o,d);
		double shippingPrice = 1.7;
		double tax = 2 ;
		Double total = distanceKm * shippingPrice  * tax;

		return "CAR SERVICE WITH THE DISTANCE " + distanceKm + " VALUE : R$:" +total ;
	}

}
