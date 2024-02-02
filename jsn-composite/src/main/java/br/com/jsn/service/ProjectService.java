package br.com.jsn.service;

import org.springframework.stereotype.Service;

import br.com.jsn.composite.Project;
import br.com.jsn.composite.TaskService;
import br.com.jsn.dto.TaskDTO;

@Service
public class ProjectService {


    public void createProject(){
       
        TaskDTO task = new TaskDTO();
        task.setDescription("I need a professional for paint my home");
        task.setRequirements("good knoledge with paint");
        task.setFunctional("Painter");
        Project project =new Project("Paint");
        TaskService taskService = new TaskService(task);
        project.add(taskService);
       System.out.println( "muniz soares engenharia de software");
       project.display();
    }


    


    
}
