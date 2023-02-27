package br.com.jsn.builder;

import br.com.jsn.model.*;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProductNotification {

    private AlertModel alertModel ;
    private EmailModel emailModel ;
    private DialogModel dialogModel ;
    private SmsModel smsModel ;
    private MessageModel messageModel ;

    public ProductNotification(){}

    public ProductNotification(AlertModel alertModel,
                               EmailModel emailModel,
                               DialogModel dialogModel,
                               SmsModel smsModel,
                               MessageModel messageModel) {
        this.alertModel = alertModel;
        this.emailModel = emailModel;
        this.dialogModel = dialogModel;
        this.smsModel = smsModel;
        this.messageModel = messageModel;
    }

    public AlertModel getAlertModel() {
        return alertModel;
    }

    public void setAlertModel(AlertModel alertModel) {
        this.alertModel = alertModel;
    }

    public EmailModel getEmailModel() {
        return emailModel;
    }

    public void setEmailModel(EmailModel emailModel) {
        this.emailModel = emailModel;
    }

    public DialogModel getDialogModel() {
        return dialogModel;
    }

    public void setDialogModel(DialogModel dialogModel) {
        this.dialogModel = dialogModel;
    }

    public SmsModel getSmsModel() {
        return smsModel;
    }

    public void setSmsModel(SmsModel smsModel) {
        this.smsModel = smsModel;
    }

    public MessageModel getMessageModel() {
        return messageModel;
    }

    public void setMessageModel(MessageModel messageModel) {
        this.messageModel = messageModel;
    }

    @Override
    public String toString() {
        return "ProductNotification{" +
                "alertModel=" + alertModel +
                ", emailModel=" + emailModel +
                ", dialogModel=" + dialogModel +
                ", smsModel=" + smsModel +
                ", messageModel=" + messageModel +
                '}';
    }
}
