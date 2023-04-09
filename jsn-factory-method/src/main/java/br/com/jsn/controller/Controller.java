package br.com.jsn.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@RequestMapping(value = "/logistic_calculator")
public class Controller {



    @GetMapping("/calculate")
    public ResponseEntity<String> calculatDelivery(@RequestParam("origin") String origin , @RequestParam("destin") String destin){

        System.out.println(origin);

        System.out.println(destin);
        return ResponseEntity.ok("Hello World!");
    }
}
