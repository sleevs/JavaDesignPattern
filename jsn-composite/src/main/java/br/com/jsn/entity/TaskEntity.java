package br.com.jsn.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="task")
public class TaskEntity {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)    
    private Long taskId;
    @Column(name="task_description")
    private String description;
    @Column(name="task_functional")
    private String functional ;
    @Column(name="task_requirements")
    private String requirements ;
    @Column(name="analyze_id")
    private Long analyzeId ;
    @Column(name="task_type")
    private String taskType ;
    @Column(name="task_status")
    private String taskStatus ;


    public TaskEntity(){}


    public Long getTaskId() {
        return taskId;
    }


    public void setTaskId(Long taskId) {
        this.taskId = taskId;
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

    public String getTaskType() {
        return taskType;
    }


    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Long getAnalyzeId() {
        return analyzeId;
    }

    public void setAnalyzeId(Long analyzeId) {
        this.analyzeId = analyzeId;
    }

    
}
