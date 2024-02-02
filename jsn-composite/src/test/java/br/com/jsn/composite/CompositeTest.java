package br.com.jsn.composite;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import br.com.jsn.dto.TaskDTO;

public class CompositeTest {


    @Test
    @DisplayName("Should be true")
    public void createProject(){
       
        TaskDTO task = new TaskDTO();
        task.setDescription("I need a professional for paint my home");
        task.setRequirements("good knowledge with paint");
        task.setFunctional("Painter");
        Project project =new Project("Paint");
        TaskService taskService = new TaskService(task);
        project.add(taskService);
        project.display();
       assertNotNull(project);
        // assertTrue(true);
    }
    
}
