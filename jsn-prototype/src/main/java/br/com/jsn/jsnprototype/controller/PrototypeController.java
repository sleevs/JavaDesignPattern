package br.com.jsn.jsnprototype.controller;


import br.com.jsn.jsnprototype.prototype.Prototype;
import br.com.jsn.jsnprototype.service.CatelogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

//@CrossOrigin(origins ="*")
@RestController
@RequestMapping(value ="/prototype_api")
public class PrototypeController {


    @Autowired
    private CatelogoService catelogoService ;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<Prototype>> list(){

        List<Prototype> result = catelogoService.list();
        if(result != null){
            return new ResponseEntity<List<Prototype>>( result , HttpStatus.OK);
        }
         return new ResponseEntity<List<Prototype>>( result , HttpStatus.NOT_FOUND);
    }

    }

