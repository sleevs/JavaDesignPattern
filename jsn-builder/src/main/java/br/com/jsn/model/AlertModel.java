package br.com.jsn.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AlertModel {

    private String info ;

    public AlertModel(){

    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


    @Override
    public String toString() {
        return "AlertModel{" +
                "info='" + info + '\'' +
                '}';
    }
}
