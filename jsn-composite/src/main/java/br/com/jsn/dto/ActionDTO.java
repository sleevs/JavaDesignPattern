package br.com.jsn.dto;

import java.util.List;

public class ActionDTO {

    private Long analyze;
    private Long id;
    private String objective;
    private String resource;
    private String start;
    private String end;
    private String status;
    private Long employee ;
    private Long task;
 
    public ActionDTO(){}


    
    
    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

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


    public Long getEmployee() {
        return employee;
    }

    public void setEmployee(Long employee) {
        this.employee = employee;
    }

    public Long getTask() {
        return task;
    }

    public void setTask(Long task) {
        this.task = task;
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

    

    
    
    


    
}
