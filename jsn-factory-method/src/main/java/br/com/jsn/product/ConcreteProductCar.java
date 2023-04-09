package br.com.jsn.product;

import br.com.jsn.model.CoordinateModel;
import br.com.jsn.model.ResponseModel;
import br.com.jsn.service.ShippingCalculator;

import java.text.DecimalFormat;

public class ConcreteProductCar extends Product{

	@Override
	public ResponseModel action(CoordinateModel o , CoordinateModel d) {


		ResponseModel responseModel = new ResponseModel();
		ShippingCalculator shippingCalculator = new ShippingCalculator();
		double distanceKm = shippingCalculator.calcularDistancia(o,d);
		double shippingPrice = 1.7;
		double tax = 2 ;
		Double total = distanceKm * shippingPrice  * tax;

		String resultTotal = new DecimalFormat("#,##0.00").format(total);
		String resultDistance = new DecimalFormat("#,##0.00").format(distanceKm);


		responseModel.setDistance("km:"+resultDistance);
		responseModel.setValue("R$:"+resultTotal);
		responseModel.setDescription("CAR SERVICE");
		return responseModel ;
	}

}
