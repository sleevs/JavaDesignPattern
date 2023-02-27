package br.com.jsn.controller;


import br.com.jsn.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/builder")
public class NotificationController {


    @Autowired
    private NotificationService notificationService;

    @GetMapping("/basic")
    public String basicNotification(){
        return notificationService.basic() ;
    }


    @GetMapping("/full")
    public String fullNotification(){
        return notificationService.full();
    }
}
