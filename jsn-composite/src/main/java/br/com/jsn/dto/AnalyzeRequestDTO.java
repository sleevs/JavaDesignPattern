package br.com.jsn.dto;

import java.util.List;

public class AnalyzeRequestDTO {

    
    private Long employee;
    private String type;
    private List<TaskDTO> tasks;
    private ProjectDTO project;
    private String value ;
    private String cost;
    private Long estimate;
    private String complexity;
  

    public AnalyzeRequestDTO(){}

    public Long getEmployee() {
        return employee;
    }

    public void setEmployee(Long employee) {
        this.employee = employee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    

    public List<TaskDTO> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskDTO> tasks) {
        this.tasks = tasks;
    }

    public Long getEstimate() {
        return estimate;
    }

    public void setEstimate(Long estimate) {
        this.estimate = estimate;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    public ProjectDTO getProject() {
        return project;
    }

    public void setProject(ProjectDTO project) {
        this.project = project;
    }


    
}
