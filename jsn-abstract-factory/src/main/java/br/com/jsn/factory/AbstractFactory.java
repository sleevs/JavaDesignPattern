package br.com.jsn.factory;

import br.com.jsn.product.AbstracProductWindow;
import br.com.jsn.product.AbstractProductLocation;
import br.com.jsn.product.AbstractProductMenu;


public abstract  class AbstractFactory {

    public abstract AbstracProductWindow createWindow() ;
    public abstract AbstractProductMenu createMenu();
    public abstract AbstractProductLocation createLocation();

}
