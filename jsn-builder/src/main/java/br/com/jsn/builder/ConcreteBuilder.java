package br.com.jsn.builder;

import br.com.jsn.model.*;

public class ConcreteBuilder implements Builder{

    private AlertModel alertModel ;
    private EmailModel emailModel ;
    private DialogModel dialogModel ;
    private SmsModel smsModel ;
    private MessageModel messageModel ;


    @Override
    public void getAlert(AlertModel alert) {
        this.alertModel = alert ;
    }

    @Override
    public void getMessage(MessageModel message) {
        this.messageModel = message ;
    }

    @Override
    public void getDialog(DialogModel dialog) {
        this.dialogModel = dialog ;
    }

    @Override
    public void getEmail(EmailModel email) {
        this.emailModel = email ;
    }

    @Override
    public void getSms(SmsModel sms) {
        this.smsModel = sms ;
    }


    public ProductNotification getResult(){
        return new ProductNotification(alertModel , emailModel ,dialogModel , smsModel , messageModel);
    }
}
