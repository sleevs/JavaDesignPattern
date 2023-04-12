package br.com.jsn.service;



import br.com.jsn.factory.AbstractFactory;
import br.com.jsn.product.AbstractProductPayment;
import org.springframework.stereotype.Service;


@Service
public class ProcessPayment {

    private AbstractFactory factory ;


    public ProcessPayment(AbstractFactory factory){
        this.factory = factory ;
    }

    public void operation(Double value){

        AbstractProductPayment payment = factory.createPayment();
        payment.payment(value);
    }





}
