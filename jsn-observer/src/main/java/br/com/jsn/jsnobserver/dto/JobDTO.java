package br.com.jsn.jsnobserver.dto;

import java.util.List;

public class JobDTO {


    private String tittle;
    private String requirements;
    private boolean isOpen;

    public JobDTO(String tittle, String requirements) {
        this.tittle = tittle;
        this.requirements = requirements;
        this.isOpen = true;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    

    
    
}