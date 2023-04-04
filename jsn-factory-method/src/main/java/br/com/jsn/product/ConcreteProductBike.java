package br.com.jsn.product;

import br.com.jsn.model.CoordinateModel;
import br.com.jsn.service.ShippingCalculator;


public class ConcreteProductBike extends Product {



	@Override
	public String  action(CoordinateModel o , CoordinateModel d) {
		// TODO Auto-generated method stub

		ShippingCalculator shippingCalculator = new ShippingCalculator();
		double distanceKm = shippingCalculator.calcularDistancia(o,d);
		double shippingPrice = 1.7 ;

		Double total = distanceKm * shippingPrice  ;

		return "BIKE SERVICE WITH THE DISTANCE Km :" + distanceKm + " VALUE R$:" +total ;
	}

}
