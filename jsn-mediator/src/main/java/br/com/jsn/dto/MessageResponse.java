package br.com.jsn.dto;

public class MessageResponse {

    String description;
    String status;
    String destination;
    String origin;
    String dateRead;
    String dateCreate;

    public MessageResponse(){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDateRead() {
        return dateRead;
    }

    public void setDateRead(String dateRead) {
        this.dateRead = dateRead;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

      
}
