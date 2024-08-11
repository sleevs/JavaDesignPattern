package br.com.jsn.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jsn.dto.AnalyzeDTO;
import br.com.jsn.dto.ProjectDTO;
import br.com.jsn.dto.TaskDTO;
import br.com.jsn.entity.AnalyzeEntity;
import br.com.jsn.repository.AnalyzeRepository;
import br.com.jsn.util.DtoMapper;


@Service
public class AnalyzeService {


    @Autowired
    private AnalyzeRepository  analyzeRepository;
    
    @Autowired
    private DtoMapper dtoMapper;

    @Autowired
    private TaskService taskService;

    public AnalyzeDTO saveAnalyze(AnalyzeDTO dto){

            AnalyzeEntity newAnalyzeEntity = dtoMapper.buildAnalyzeEntity(dto);
            var result =  analyzeRepository.save(newAnalyzeEntity);
  
            return dtoMapper.buildAnalyzeDTO(result) ;
    
}


public AnalyzeDTO findAnalysisByTaskId(Long task) {
    
    if(task != null){

    AnalyzeEntity result = analyzeRepository.findAnalysisByTask(task);
    
    return dtoMapper.buildAnalyzeDTO(result); 
    }
    return  null ;
}


public List<AnalyzeDTO> findAnalysisByEmployeeAndStatus(Long id , String status){

    List<AnalyzeDTO> result = new ArrayList<>();
    var list = analyzeRepository.findAnalyzeByEmployeeAndStatus(id, status);

    for(AnalyzeEntity a : list){

        result.add(dtoMapper.buildAnalyzeDTO(a));
    }
    return result ;
}



    public AnalyzeDTO findAnalyzeById(Long id){
        AnalyzeEntity result = analyzeRepository.findAnalyzeById(id);
        var list = taskService.findTasksByAnalysis(result.getAnalyzeId());
        List<TaskDTO> listTask = new ArrayList<>();
        AnalyzeDTO analysis = dtoMapper.buildAnalyzeDTO(result) ;

        for(TaskDTO taskDTO : list){
            listTask.add(taskDTO);
        }
        analysis.setTasks(listTask);
        return analysis ;
    }


    public List<AnalyzeDTO> findAnalysisByProjectId(Long id){
        
        if(id != null){
        List<AnalyzeEntity> listResult = analyzeRepository.findAnalysisByProjectId(id);
        List<AnalyzeDTO> listAnalyzeDTO = new ArrayList<>();
        
        for(AnalyzeEntity entity : listResult){
           var taskList = taskService.findTasksByAnalysis(entity.getAnalyzeId());
           AnalyzeDTO analyzeDTO = dtoMapper.buildAnalyzeDTO(entity);
           analyzeDTO.setTasks(taskList);
           listAnalyzeDTO.add(analyzeDTO);
        }
        return listAnalyzeDTO ;
        }
        return null ;
    }

  
}

    
