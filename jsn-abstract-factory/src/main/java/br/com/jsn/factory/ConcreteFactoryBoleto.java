package br.com.jsn.factory;

import br.com.jsn.product.AbstractProductPayment;
import br.com.jsn.product.ConcreteProductBoleto;

public class ConcreteFactoryBoleto extends AbstractFactory{
    @Override
    public AbstractProductPayment createPayment() {
        return new ConcreteProductBoleto();
    }
}
