package br.com.jsn.factory;

import br.com.jsn.product.AbstractProductPayment;
import br.com.jsn.product.ConcreteProductCreditCard;

public class ConcreteFactoryCreditCard extends AbstractFactory{
    @Override
    public AbstractProductPayment createPayment() {
        return new ConcreteProductCreditCard();
    }
}
