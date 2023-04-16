package br.com.jsn.controller;


import br.com.jsn.model.Boleto;
import br.com.jsn.model.Card;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping(value = "/payment")
public class PaymentController {



    @RequestMapping("/boleto")
    public ResponseEntity<Boleto> getBoleto(String numberBolete){

        return null ;
    }


    @RequestMapping("/credit_card")
    public ResponseEntity<String> getCreditCard(Card info){

        return null ;
    }

}
