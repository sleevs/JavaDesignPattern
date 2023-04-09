package br.com.jsn.product;

import br.com.jsn.model.CoordinateModel;
import br.com.jsn.model.ResponseModel;
import br.com.jsn.service.ShippingCalculator;

import java.text.DecimalFormat;


public class ConcreteProductBike extends Product {


	@Override
	public ResponseModel action(CoordinateModel o , CoordinateModel d) {
		// TODO Auto-generated method stub

		ResponseModel responseModel = new ResponseModel();
		ShippingCalculator shippingCalculator = new ShippingCalculator();
		double distanceKm = shippingCalculator.calcularDistancia(o,d);
		double shippingPrice = 1.7 ;

		Double total = distanceKm * shippingPrice  ;

		String resultTotal = new DecimalFormat("#,##0.00").format(total);
		String resultDistance = new DecimalFormat("#,##0.00").format(distanceKm);

		responseModel.setDistance("km:"+resultDistance);
		responseModel.setValue("R$:"+resultTotal);
		responseModel.setDescription("BIKE SERVICE");

		return responseModel ;
	}

}
