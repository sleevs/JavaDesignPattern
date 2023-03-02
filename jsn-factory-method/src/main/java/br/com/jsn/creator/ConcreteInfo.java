package br.com.jsn.creator;

import br.com.jsn.product.ProductInfo;
import br.com.jsn.product.ProductLog;

public class ConcreteInfo extends Creator {
    @Override
    public ProductLog factoryMethod() {
        return new ProductInfo();
    }
}
