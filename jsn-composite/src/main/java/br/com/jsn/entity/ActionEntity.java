package br.com.jsn.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="action")
public class ActionEntity {

   
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
    @Column(name ="action_id")
    private Long actionId;
    @Column(name ="action_resource")
    private String resource;
    @Column(name ="action_start")
    private String start;
    @Column(name ="action_end")
    private String end;
    @Column(name ="action_status")
    private String status;
    @Column(name ="employee_id")
    private Long employee;
    @Column(name ="task_id")
    private Long taskId ;

    public ActionEntity(){}

  
   

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }




    public Long getActionId() {
        return actionId;
    }




    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }




    public Long getEmployee() {
        return employee;
    }




    public void setEmployee(Long employee) {
        this.employee = employee;
    }

    
        
    
}
