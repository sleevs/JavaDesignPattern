package br.com.jsn.entity;


import jakarta.persistence.Column;

public class AnalyzeEntity {

    @Column(name="analyze_id")
    private Long analyzeId;
    @Column(name="analyze_date")
    private String analyzeDate;
    @Column(name="analyze_value")
    private String value ;
    @Column(name="analyze_cost")
    private String cost;
    @Column(name="analyze_time")
    private String time;
    @Column(name="analyze_complexity")
    private String complexity;
    @Column(name="analyze_priority")
    private String priority;
    @Column(name="analyze_analyst")
    private Long analyst ;
    @Column(name="task_id")
    private Long task ;
    @Column(name="analyze_status")
    private String status;
    @Column(name="resource_id")
    private Long resource ;

    public AnalyzeEntity(){

    }

    public Long getAnalyzeId() {
        return analyzeId;
    }

    public void setAnalyzeId(Long analyzeId) {
        this.analyzeId = analyzeId;
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

    public Long getAnalyst() {
        return analyst;
    }

    public void setAnalyst(Long analyst) {
        this.analyst = analyst;
    }

    public Long getTask() {
        return task;
    }

    public void setTask(Long task) {
        this.task = task;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getResource() {
        return resource;
    }

    public void setResource(Long resource) {
        this.resource = resource;
    }

    public String getAnalyzeDate() {
        return analyzeDate;
    }

    public void setAnalyzeDate(String analyzeDate) {
        this.analyzeDate = analyzeDate;
    }

    

    
    
}
