package br.com.jsn.dto;

import java.util.List;

public class TaskDTO {

    private Long id;
    private String description;
    private String functional ;
    private String requirements ;
    private String type ;
    private String status;
    private Long analyze;
    private List<ActionDTO> actions;

    public TaskDTO(){

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFunctional() {
        return functional;
    }

    public void setFunctional(String functional) {
        this.functional = functional;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAnalyze() {
        return analyze;
    }

    public void setAnalyze(Long analyze) {
        this.analyze = analyze;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ActionDTO> getActions() {
        return actions;
    }

    public void setActions(List<ActionDTO> actions) {
        this.actions = actions;
    }

    
    

 

   
}
