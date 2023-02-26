package br.com.jsn.factory;

import br.com.jsn.product.*;

public class ConcreteFactoryAndroid extends AbstractFactory{


    @Override
    public AbstracProductWindow createWindow() {
        return new ConcreteProductWindow();
    }

    @Override
    public AbstractProductMenu createMenu() {
        return new ConcreteProductMenu();
    }

    @Override
    public AbstractProductLocation createLocation() {
        return new ConcreteProductLocation();
    }
}
