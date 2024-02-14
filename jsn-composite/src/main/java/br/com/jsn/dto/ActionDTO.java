package br.com.jsn.dto;

import java.util.List;

public class ActionDTO {

    private String objective;
    private List<String> itens;
    private String resource;
    private String start;
    private String end;
    private String status;
    private List<String> description;

    public ActionDTO(){}

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public List<String> getItens() {
        return itens;
    }

    public void setItens(List<String> itens) {
        this.itens = itens;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ActionDTO [objective=" + objective + ", itens=" + itens + ", resource=" + resource + ", start=" + start
                + ", end=" + end + ", status=" + status + ", description=" + description + "]";
    }

    
    
    


    
}
