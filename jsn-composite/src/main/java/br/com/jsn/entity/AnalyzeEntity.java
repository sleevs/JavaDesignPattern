package br.com.jsn.entity;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "analysis")
public class AnalyzeEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)    
    private Long analyzeId;
    @Column(name="analyze_date")
    private Date analyzeDate;
    @Column(name="analyze_estimate")
    private Long analyzeEstimate;
    @Column(name="analyze_value")
    private String value ;
    @Column(name="analyze_cost")
    private String cost;
    @Column(name="analyze_complexity")
    private String complexity;
    @Column(name="employee_id")
    private Long employee ;
    @Column(name="project_id")
    private Long project ;
    @Column(name="analyze_status")
    private String status;
   
    
    

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

    public Long getEmployee() {
        return employee;
    }

    public void setEmployee(Long employee) {
        this.employee = employee;
    }

    public Date getAnalyzeDate() {
        return analyzeDate;
    }

    public void setAnalyzeDate(Date analyzeDate) {
        this.analyzeDate = analyzeDate;
    }

    public Long getAnalyzeEstimate() {
        return analyzeEstimate;
    }

    public void setAnalyzeEstimate(Long analyzeEstimate) {
        this.analyzeEstimate = analyzeEstimate;
    }



    public Long getProject() {
        return project;
    }



    public void setProject(Long project) {
        this.project = project;
    }

    

    
    
}
