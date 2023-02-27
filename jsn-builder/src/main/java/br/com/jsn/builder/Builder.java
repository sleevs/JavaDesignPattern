package br.com.jsn.builder;

import br.com.jsn.model.*;

public interface Builder {


    public void getAlert(AlertModel alert);
    public void getMessage(MessageModel message);
    public void getDialog(DialogModel dialog);
    public void getEmail(EmailModel email);
    public void getSms(SmsModel sms);

}
