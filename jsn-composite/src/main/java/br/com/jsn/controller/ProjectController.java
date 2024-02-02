package br.com.jsn.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.jsn.composite.ActionService;
import br.com.jsn.composite.AnalyzeService;
import br.com.jsn.composite.DeliveryService;
import br.com.jsn.composite.EmployeeService;
import br.com.jsn.composite.Project;
import br.com.jsn.composite.TaskService;
import br.com.jsn.dto.ActionDTO;
import br.com.jsn.dto.AnalyzeDTO;
import br.com.jsn.dto.DeliveryDTO;
import br.com.jsn.dto.EmployeeDTO;
import br.com.jsn.dto.TaskDTO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class ProjectController {

    /*

    Why? - What is the problem ? Why is it being sponsored?
    What? - What is the work that will be performed on the project? 
            What are the major products/deliverables?
    Who? - Who will be involved and what will be their responsibilities
            within the project? How will they be organized?
    When? - What is the project timeline and when will particularly
            meaningful points, referred to as milestones, be complete?

    Scope management
    Requirements management
    Schedule management
    Financial management
    Quality management
    Resource management
    Stakeholder management – New from PMBOK 5
    Communications management
    Project change management
    Risk management
     * 
    */

     @GetMapping("/test")
     public ResponseEntity<Object> createProject(){
       
        TaskDTO task = new TaskDTO();
        task.setDescription("I need a professional for paint my home");
        task.setRequirements("good knowledge with paint");
        task.setFunctional("Painter");

        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmail("mineiro@gmail.com");
        employeeDTO.setExperience("20 years");
        employeeDTO.setPhone("21984456632");
        employeeDTO.setSkills("Pinter and Decorator");
        employeeDTO.setType("Professional");
        employeeDTO.setName("Mineiro");

        AnalyzeDTO analyzeDTO = new AnalyzeDTO();
        analyzeDTO.setComplexity("LOW");
        analyzeDTO.setCost("$180.00");
        analyzeDTO.setObjective("Painter the chiken");
        analyzeDTO.setTime("10 days");
        analyzeDTO.setValue("$100.00");

        ActionDTO actionDTO = new ActionDTO();
        actionDTO.setObjective("Paint and Decorate");
        actionDTO.setResource("MagicWall Chalkboard Paint Light Tint Base 1 Liter");
        actionDTO.setEnd("monday 02-26-2024");
        actionDTO.setStart("tuesday 02-13-2024");
        List<String> itens = new ArrayList<>();
        itens.add("Pressure-Wash Walls");
        itens.add("Repair Damaged Surfaces");
        itens.add("Caulk Trim");
        itens.add("Paint");
        itens.add("Clean up");
        actionDTO.setItens(itens);

        DeliveryDTO deliveryDTO = new DeliveryDTO();
        deliveryDTO.setDate("02-26-2024");
        
        


        Project project =new Project("Paint");
        TaskService taskService = new TaskService(task);
        EmployeeService employeeService = new EmployeeService(employeeDTO);
        AnalyzeService anAnalyzeService = new AnalyzeService(analyzeDTO);
        ActionService actionService = new ActionService(actionDTO);
        DeliveryService deliveryService = new DeliveryService(deliveryDTO);

        project.add(taskService);
        project.add(employeeService);
        project.add(anAnalyzeService);
        project.add(actionService);
        project.add(deliveryService);
       
       return ResponseEntity.ok(project.display());
    }
    
}
