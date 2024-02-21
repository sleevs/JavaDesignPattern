package br.com.jsn.composite;


import br.com.jsn.dto.ProjectDTO;

public class ProjectElement  extends ManagerComponent{

    ProjectDTO projectDTO ;

    

    public ProjectElement(ProjectDTO projectDTO) {
        this.projectDTO = projectDTO;
    }



    @Override
    public Object display() {
        // TODO Auto-generated method stub
        return projectDTO;
    }



    public ProjectDTO getProjectDTO() {
        return projectDTO;
    }



    public void setProjectDTO(ProjectDTO projectDTO) {
        this.projectDTO = projectDTO;
    }
    
}
