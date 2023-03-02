package br.com.jsn.creator;

import br.com.jsn.product.ProductError;
import br.com.jsn.product.ProductLog;

public class ConcreteError extends Creator{
    @Override
    public ProductLog factoryMethod() {
        return new ProductError();
    }
}
