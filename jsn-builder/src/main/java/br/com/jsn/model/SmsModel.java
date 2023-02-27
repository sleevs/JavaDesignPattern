package br.com.jsn.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SmsModel {

    private String originNumber ;
    private String DestinationNumber ;
    private String message ;


    public SmsModel(){}

    public String getOriginNumber() {
        return originNumber;
    }

    public void setOriginNumber(String originNumber) {
        this.originNumber = originNumber;
    }

    public String getDestinationNumber() {
        return DestinationNumber;
    }

    public void setDestinationNumber(String destinationNumber) {
        DestinationNumber = destinationNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SmsModel{" +
                "originNumber='" + originNumber + '\'' +
                ", DestinationNumber='" + DestinationNumber + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
