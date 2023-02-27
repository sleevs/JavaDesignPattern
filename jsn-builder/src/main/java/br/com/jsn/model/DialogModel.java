package br.com.jsn.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DialogModel {
    private String type ;

    public DialogModel(){}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "DialogModel{" +
                "type='" + type + '\'' +
                '}';
    }
}
