package br.com.jsn.dto;

public class EmployeeDTO {

    private String name;
    private String type;
    private String email;
    private String phone;
    private String skills;
    private String experience;
    private String certification;


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


    @Override
    public String toString() {
        return "EmployeeDTO [name=" + name + ", type=" + type + ", email=" + email + ", phone=" + phone + ", skills="
                + skills + ", experience=" + experience + ", certification=" + certification + "]";
    }

    
}
