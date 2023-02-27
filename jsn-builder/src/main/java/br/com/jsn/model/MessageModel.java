package br.com.jsn.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MessageModel {

    private String content ;


    public MessageModel(){

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "MessageModel{" +
                "content='" + content + '\'' +
                '}';
    }
}
