package br.com.jsn.product;

import br.com.jsn.model.CoordinateModel;
import br.com.jsn.model.ResponseModel;

public abstract class Product {


    public abstract ResponseModel action(CoordinateModel o , CoordinateModel d);
}
