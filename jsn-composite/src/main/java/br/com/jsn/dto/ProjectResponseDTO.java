package br.com.jsn.dto;

import java.util.List;

public class ProjectResponseDTO {

    private ProjectDTO projectDTO ;
    private List<AnalyzeDTO> listAnalysis;

    public ProjectResponseDTO(){

    }

    

    public List<AnalyzeDTO> getListAnalysis() {
        return listAnalysis;
    }



    public void setListAnalysis(List<AnalyzeDTO> listAnalysis) {
        this.listAnalysis = listAnalysis;
    }



    public ProjectDTO getProjectDTO() {
        return projectDTO;
    }



    public void setProjectDTO(ProjectDTO projectDTO) {
        this.projectDTO = projectDTO;
    }

    
    
    
    
}
