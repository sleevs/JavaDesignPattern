package br.com.jsn.entity;

import java.util.List;

import br.com.jsn.dto.EmployeeDTO;
import br.com.jsn.dto.TaskDTO;

public class AnalyzeEntity {

        private String objective;
    private String value ;
    private String cost;
    private String time;
    private String complexity;
    private String priority;
    private EmployeeDTO analyst ;
    private TaskDTO task ;
    private String status;
    private List<String> resource ;

    public AnalyzeEntity(){

    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public EmployeeDTO getAnalyst() {
        return analyst;
    }

    public void setAnalyst(EmployeeDTO analyst) {
        this.analyst = analyst;
    }

    public TaskDTO getTask() {
        return task;
    }

    public void setTask(TaskDTO task) {
        this.task = task;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getResource() {
        return resource;
    }

    public void setResource(List<String> resource) {
        this.resource = resource;
    }

    
    
}