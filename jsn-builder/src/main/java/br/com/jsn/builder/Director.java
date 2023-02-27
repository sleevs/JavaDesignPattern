package br.com.jsn.builder;

import br.com.jsn.model.*;

public class Director {


    public void basicNotification(Builder builder , AlertModel alertModel , EmailModel emailModel){
        builder.getAlert(alertModel);
        builder.getEmail(emailModel);
    }

    public void fullNotification(Builder builder , AlertModel alertModel , EmailModel emailModel,
                                 DialogModel dialogModel , SmsModel smsModel , MessageModel messageModel){
        builder.getAlert(alertModel);
        builder.getEmail(emailModel);
        builder.getDialog(dialogModel);
        builder.getSms(smsModel);
        builder.getMessage(messageModel);
    }
}
