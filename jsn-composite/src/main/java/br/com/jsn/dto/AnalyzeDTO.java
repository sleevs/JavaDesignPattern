package br.com.jsn.dto;

import java.util.List;


public class AnalyzeDTO { 

   
    
    private Long id;
    private ProjectDTO project ;
    private EmployeeDTO employee ;
    private String value ;
    private String cost;
    private Long estimate;
    private String complexity;
    private String status;
    private String date;
    
    private List<TaskDTO> tasks;
 

    public AnalyzeDTO(){}

  

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

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public Long getEstimate() {
        return estimate;
    }

    public void setEstimate(Long estimate) {
        this.estimate = estimate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    
    public List<TaskDTO> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskDTO> tasks) {
        this.tasks = tasks;
    }



    public ProjectDTO getProject() {
        return project;
    }



    public void setProject(ProjectDTO project) {
        this.project = project;
    }



    public EmployeeDTO getEmployee() {
        return employee;
    }



    public void setEmployee(EmployeeDTO employee) {
        this.employee = employee;
    }

 

    
    
}
