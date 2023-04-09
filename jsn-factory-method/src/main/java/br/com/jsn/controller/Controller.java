package br.com.jsn.controller;

import br.com.jsn.creator.*;
import br.com.jsn.model.CoordinateModel;
import br.com.jsn.model.RequestModel;
import br.com.jsn.model.ResponseModel;
import br.com.jsn.product.ConcreteProductBike;
import br.com.jsn.product.ConcreteProductCar;
import br.com.jsn.product.ConcreteProductMotorcycle;
import br.com.jsn.product.ConcreteProductTruck;
import br.com.jsn.service.GeoLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/logistic_calculator")
public class Controller {

    @Autowired
    private GeoLocation geoLocation ;


    @RequestMapping("/bike")
    public ResponseEntity<ResponseModel> calculatDeliveryBike(@RequestBody RequestModel request){

        CoordinateModel o = geoLocation.getCoord(request.getOrigin());
        CoordinateModel d = geoLocation.getCoord(request.getDestination());

        Creator creator  = new ConcreteCreatorBike();
        ConcreteProductBike result = (ConcreteProductBike) creator.factoryMethod();
        ResponseModel responseModel = result.action(o,d);
        responseModel.setOrigin(request.getOrigin());
        responseModel.setDestination(request.getDestination());

        return ResponseEntity.ok(responseModel);
    }

    @RequestMapping("/moto")
    public ResponseEntity<ResponseModel> calculatDeliveryMotorcycle(@RequestBody RequestModel request){

        CoordinateModel o = geoLocation.getCoord(request.getOrigin());
        CoordinateModel d = geoLocation.getCoord(request.getDestination());

        Creator creator = new ConcreteCreatorMotorcycle();
        ConcreteProductMotorcycle result = (ConcreteProductMotorcycle) creator.factoryMethod();
        ResponseModel responseModel = result.action(o,d);
        responseModel.setOrigin(request.getOrigin());
        responseModel.setDestination(request.getDestination());


        return ResponseEntity.ok(responseModel);
    }


    @RequestMapping("/car")
    public ResponseEntity<ResponseModel> calculatDeliveryCar(@RequestBody RequestModel request){

        CoordinateModel o = geoLocation.getCoord(request.getOrigin());
        CoordinateModel d = geoLocation.getCoord(request.getDestination());


        Creator creator = new ConcreteCreatorCar();
        ConcreteProductCar result = (ConcreteProductCar) creator.factoryMethod();
        ResponseModel responseModel = result.action(o,d);
        responseModel.setOrigin(request.getOrigin());
        responseModel.setDestination(request.getDestination());


        return ResponseEntity.ok(responseModel);
    }


    @RequestMapping("/truck")
    public ResponseEntity<ResponseModel> calculatDeliveryTruck(@RequestBody RequestModel request){

        CoordinateModel o = geoLocation.getCoord(request.getOrigin());
        CoordinateModel d = geoLocation.getCoord(request.getDestination());

        Creator creator = new ConcreteCreatorTruck();
        ConcreteProductTruck result = (ConcreteProductTruck) creator.factoryMethod();
        ResponseModel responseModel = result.action(o,d);
        responseModel.setOrigin(request.getOrigin());
        responseModel.setDestination(request.getDestination());


        return ResponseEntity.ok(responseModel);
    }


    @RequestMapping("/all_category")
    public ResponseEntity<List<ResponseModel>> calculatDeliveryAll(@RequestBody RequestModel request){


        List<ResponseModel> listResult = new ArrayList<>();

        CoordinateModel o = geoLocation.getCoord(request.getOrigin());
        CoordinateModel d = geoLocation.getCoord(request.getDestination());

        Creator creatorBike = new ConcreteCreatorBike();
        ConcreteProductBike concreteProductBike = (ConcreteProductBike) creatorBike.factoryMethod();
        ResponseModel responseModelBike = concreteProductBike.action(o,d) ;
        responseModelBike.setOrigin(request.getOrigin());
        responseModelBike.setDestination(request.getDestination());
        listResult.add(responseModelBike);

        Creator creatorMotorcycle = new ConcreteCreatorMotorcycle();
        ConcreteProductMotorcycle concreteProductMotorcycle = (ConcreteProductMotorcycle) creatorMotorcycle.factoryMethod();
        ResponseModel responseModelMotorcycle = concreteProductMotorcycle.action(o,d);
        responseModelMotorcycle.setOrigin(request.getOrigin());
        responseModelMotorcycle.setDestination(request.getDestination());
        listResult.add(responseModelMotorcycle);

        Creator creatorCar = new ConcreteCreatorCar();
        ConcreteProductCar concreteProductCar = (ConcreteProductCar) creatorCar.factoryMethod();
        ResponseModel responseModelCar = concreteProductCar.action(o,d);
        responseModelCar.setOrigin(request.getOrigin());
        responseModelCar.setDestination(request.getDestination());
        listResult.add( responseModelCar);


        Creator creatorTruck = new ConcreteCreatorTruck();
        ConcreteProductTruck concreteProductTruck = (ConcreteProductTruck) creatorTruck.factoryMethod();
        ResponseModel responseModelTruck = concreteProductTruck.action(o,d) ;
        responseModelTruck.setOrigin(request.getOrigin());
        responseModelTruck.setDestination(request.getDestination());
        listResult.add(responseModelTruck);


        return ResponseEntity.ok(listResult);
    }
}
