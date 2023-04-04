package br.com.jsn.service;


import br.com.jsn.model.CoordinateModel;
import org.springframework.stereotype.Service;

public class ShippingCalculator {


    public double calcularDistancia(CoordinateModel origin,
                                    CoordinateModel destin) {

        if ((origin.getLat() == destin.getLat()) && (origin.getLon() == destin.getLon())) {
            return 0;
        } else {

            double theta = origin.getLon() - destin.getLon();
            double dist = Math.sin(Math.toRadians(origin.getLat()))
                    * Math.sin(Math.toRadians(destin.getLat()))
                    + Math.cos(Math.toRadians(origin.getLat()))
                    * Math.cos(Math.toRadians(destin.getLat()))
                    * Math.cos(Math.toRadians(theta));


           double  result =((Math.toDegrees(Math.acos(dist))) * 69.09 * 1.6093);
            return result  ;
        }
    }


}
