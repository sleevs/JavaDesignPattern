package br.com.jsn.service;


import br.com.jsn.builder.ConcreteBuilder;
import br.com.jsn.builder.Director;
import br.com.jsn.builder.ProductNotification;
import br.com.jsn.model.*;
import br.com.jsn.util.Constants;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {


    public String basic(){
        Director director = new Director();
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();

        AlertModel alertModel = new AlertModel();
        alertModel.setInfo("ALERT : JSN SOFTWARE APP TESTE");

        EmailModel emailModel = new EmailModel();
        emailModel.setFrom("notifyapp@gmail.com");
        emailModel.setTo("builderpattern@hotmail.com");
        emailModel.setSubject("TEST APPLICATION WITH BUILDER PATTERN");

        director.basicNotification(concreteBuilder , alertModel , emailModel);
        ProductNotification productNotification = concreteBuilder.getResult();

        StringBuilder notification =  new StringBuilder() ;
        notification.append(Constants.ALERT.getValue());
        notification.append(productNotification.getAlertModel());
        notification.append(Constants.EMAIL.getValue());
        notification.append(productNotification.getEmailModel());

        return notification.toString();

    }

    public String full() {

        Director director = new Director();
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();

        SmsModel smsModel = new SmsModel();
        smsModel.setMessage("TESTE APP BUILDER PATTERN");
        smsModel.setDestinationNumber("551977675000");
        smsModel.setOriginNumber("5521987678000");

        MessageModel messageModel = new MessageModel();
        messageModel.setContent("APP BUILDER PATTERN OPERATIONAL");

        DialogModel dialogModel = new DialogModel();
        dialogModel.setType("ALERT_DIALOG");

        AlertModel alertModel = new AlertModel();
        alertModel.setInfo("ALERT : JSN SOFTWARE APP TESTE");

        EmailModel emailModel = new EmailModel();
        emailModel.setFrom("notifyapp@gmail.com");
        emailModel.setTo("builderpattern@hotmail.com");
        emailModel.setSubject("TEST APPLICATION WITH BUILDER PATTERN");

        director.fullNotification(concreteBuilder , alertModel , emailModel ,dialogModel , smsModel , messageModel);
        ProductNotification productNotification = concreteBuilder.getResult();

        StringBuilder notification =  new StringBuilder() ;
        notification.append(Constants.ALERT.getValue());
        notification.append(productNotification.getAlertModel());
        notification.append(Constants.EMAIL.getValue());
        notification.append(productNotification.getEmailModel());
        notification.append(Constants.DIALOG.getValue());
        notification.append(productNotification.getDialogModel().getType());
        notification.append(Constants.MESSAGE.getValue());
        notification.append(productNotification.getMessageModel().getContent());
        notification.append(Constants.SMS.getValue());
        notification.append(productNotification.getSmsModel());


        return notification.toString() ;
    }


}
