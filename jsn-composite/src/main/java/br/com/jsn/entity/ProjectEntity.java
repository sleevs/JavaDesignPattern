package br.com.jsn.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "project")
public class ProjectEntity {
    

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)   
    @Column(name = "project_id") 
    private Long projectId;
    @Column(name = "account_id") 
    private Long accountId;
    @Column(name = "project_type")
    private String projectType;
    @Column(name = "project_description")
    private String projectDescription;
    @Column(name = "project_scope")
    private String projectScope ;
    @Column(name = "project_date")
    private Date projectDate ;

    public ProjectEntity(){

    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }



    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getProjectScope() {
        return projectScope;
    }

    public void setProjectScope(String projectScope) {
        this.projectScope = projectScope;
    }

    public Date getProjectDate() {
        return projectDate;
    }

    public void setProjectDate(Date projectDate) {
        this.projectDate = projectDate;
    }
    
    
    


    

}
