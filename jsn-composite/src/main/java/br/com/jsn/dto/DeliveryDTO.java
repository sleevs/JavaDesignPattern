package br.com.jsn.dto;

public class DeliveryDTO {
    

    private String date;
    private String description;
    private String validation;

      public DeliveryDTO (){}

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValidation() {
        return validation;
    }

    public void setValidation(String validation) {
        this.validation = validation;
    }

    @Override
    public String toString() {
        return "DeliveryDTO [date=" + date + ", description=" + description + ", validation=" + validation + "]";
    }
    
}
