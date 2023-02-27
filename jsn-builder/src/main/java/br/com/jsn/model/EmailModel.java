package br.com.jsn.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EmailModel {

    private String from ;
    private String to ;
    private String subject ;
    private String attach ;
    public EmailModel(){}

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    @Override
    public String toString() {
        return "EmailModel{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", attach='" + attach + '\'' +
                '}';
    }
}
