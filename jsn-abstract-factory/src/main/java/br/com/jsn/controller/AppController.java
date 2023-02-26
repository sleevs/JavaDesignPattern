package br.com.jsn.controller;


import br.com.jsn.model.AndroidModel;
import br.com.jsn.model.MacModel;
import br.com.jsn.service.AndroidService;
import br.com.jsn.service.MacService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping(value = "/abstract_factory")
@Api(value = "JSN API Abstract Factory")
public class AppController {


    @Autowired
    private AndroidService androidService;

    @Autowired
    private MacService macService;


    @GetMapping ("/android")
    public AndroidModel android(){

        return androidService.getService() ;
    }


    @GetMapping ("/mac")
    public MacModel mac(){

        return macService.getService();
    }
}
