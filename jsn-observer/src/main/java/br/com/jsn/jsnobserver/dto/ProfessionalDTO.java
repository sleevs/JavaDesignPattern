package br.com.jsn.jsnobserver.dto;

import java.util.List;

public class ProfessionalDTO {

    private String name ;
    private String experience;
    private String certifications;
    private String degree;

    public ProfessionalDTO(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getCertifications() {
        return certifications;
    }

    public void setCertifications(String certifications) {
        this.certifications = certifications;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "ProfessionalDTO [name=" + name + ", experience=" + experience + ", certifications=" + certifications
                + ", degree=" + degree + "]";
    }

    

    

    
}
