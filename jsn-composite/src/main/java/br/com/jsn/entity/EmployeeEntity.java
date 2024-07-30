package br.com.jsn.entity;
import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)    
    private Long employeeId;
    @Column(name="employee_name")
    private String employeeName;
    @Column(name="employee_type")
    private String employeeType;
    @Column(name="employee_email")
    private String employeeEmail;
    @Column(name="employee_phone")
    private String employeePhone;
    @Column(name="employee_skill")
    private String employeeSkills;
    @Column(name="employee_experience")
    private String employeeExperience;
    @Column(name="employee_certification")
    private String employeeCertification;
    @Column(name="employee_create")
    private Date employeeCreate;

    public EmployeeEntity(){}

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeSkills() {
        return employeeSkills;
    }

    public void setEmployeeSkills(String employeeSkills) {
        this.employeeSkills = employeeSkills;
    }

    public String getEmployeeExperience() {
        return employeeExperience;
    }

    public void setEmployeeExperience(String employeeExperience) {
        this.employeeExperience = employeeExperience;
    }

    public String getEmployeeCertification() {
        return employeeCertification;
    }

    public void setEmployeeCertification(String employeeCertification) {
        this.employeeCertification = employeeCertification;
    }

    public Date getEmployeeDateTime() {
        return employeeCreate;
    }

    public void setEmployeeDateTime(Date employeeCreate) {
        this.employeeCreate = employeeCreate;
    }

    
    
}
