package br.com.jsn.dto;

import java.util.List;

public class ProjectResponseDTO {

    private ProjectDTO project ;
    private List<AnalyzeDTO> analysis;

    public ProjectResponseDTO(){

    }

    public ProjectDTO getProject() {
        return project;
    }

    public void setProject(ProjectDTO project) {
        this.project = project;
    }

    public List<AnalyzeDTO> getAnalysis() {
        return analysis;
    }

    public void setAnalysis(List<AnalyzeDTO> analysis) {
        this.analysis = analysis;
    }

    
    
    
}
