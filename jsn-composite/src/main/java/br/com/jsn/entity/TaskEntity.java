package br.com.jsn.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="task")
public class TaskEntity {


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)    
    private Long taskId;
    @Column(name="task_description")
    private String description;
    @Column(name="task_functional")
    private String functional ;
    @Column(name="task_requirements")
    private String requirements ;


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

    
    
}
