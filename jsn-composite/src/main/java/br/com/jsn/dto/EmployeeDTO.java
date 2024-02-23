package br.com.jsn.dto;

public class EmployeeDTO {

    private Long id;
    private String name;
    private String type;
    private String email;
    private String phone;
    private String skills;
    private String experience;
    private String certification;
    private String date ;




    public EmployeeDTO(){}


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getSkills() {
        return skills;
    }


    public void setSkills(String skills) {
        this.skills = skills;
    }


    public String getExperience() {
        return experience;
    }


    public void setExperience(String experience) {
        this.experience = experience;
    }


    public String getCertification() {
        return certification;
    }


    public void setCertification(String certification) {
        this.certification = certification;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }





    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }

    

    
}
