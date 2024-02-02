package br.com.jsn.dto;

import java.util.List;

public class ActionDTO {

    private String objective;
    private List<String> itens;
    private String resource;
    private String start;
    private String end;

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

    @Override
    public String toString() {
        return "ActionDTO [objective=" + objective + ", itens=" + itens + ", resource=" + resource + ", start=" + start
                + ", end=" + end + "]";
    }

    
    


    
}
