package br.com.jsn.dto;


public class ActionResponseDTO {

    private ProjectDTO project ;
    private AnalyzeDTO analysis;

    public ActionResponseDTO(){}

    public ProjectDTO getProject() {
        return project;
    }

    public void setProject(ProjectDTO project) {
        this.project = project;
    }

    public AnalyzeDTO getAnalysis() {
        return analysis;
    }

    public void setAnalysis(AnalyzeDTO analysis) {
        this.analysis = analysis;
    }

    
    
}
