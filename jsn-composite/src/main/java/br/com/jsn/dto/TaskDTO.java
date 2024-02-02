package br.com.jsn.dto;

public class TaskDTO {

    private String description;
    private String functional ;
    private String requirements ;

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

    @Override
    public String toString() {
        return "TaskDTO [description=" + description + ", functional=" + functional + ", requirements=" + requirements
                + "]";
    }

    
    
}
