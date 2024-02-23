package br.com.jsn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jsn.dto.AnalyzeDTO;
import br.com.jsn.dto.AnalyzeResponseDTO;
import br.com.jsn.entity.AnalyzeEntity;
import br.com.jsn.repository.AnalyzeRepository;


@Service
public class AnalyzeService implements CrudService<AnalyzeEntity>{ 


    @Autowired
    private AnalyzeRepository  analyzeRepository;


       private AnalyzeDTO build(AnalyzeEntity e){

        AnalyzeDTO analyzeDTO = new AnalyzeDTO();
        analyzeDTO.setEmployee(e.getEmployee());
        analyzeDTO.setComplexity(e.getComplexity());
        analyzeDTO.setCost(e.getCost());
        analyzeDTO.setStatus(e.getStatus());
        analyzeDTO.setPriority(e.getPriority());
        analyzeDTO.setTask(e.getTask());
       if(e.getResource() == null){
            var result = new Long(0);
            analyzeDTO.setResource(result);
        }
        analyzeDTO.setResource(e.getResource());
        analyzeDTO.setValue(e.getValue());
        analyzeDTO.setId(e.getAnalyzeId());
        analyzeDTO.setTime(e.getAnalyzeDate());      
        
        
        return analyzeDTO ;
    }

    private AnalyzeEntity build(AnalyzeDTO dto){

        AnalyzeEntity analyzeEntity = new AnalyzeEntity();
        analyzeEntity.setEmployee(dto.getEmployee());
        analyzeEntity.setAnalyzeDate(dto.getTime());
        analyzeEntity.setComplexity(dto.getComplexity());
        analyzeEntity.setCost(dto.getCost());
        analyzeEntity.setStatus(dto.getStatus());
        analyzeEntity.setTask(dto.getTask());
        analyzeEntity.setPriority(dto.getPriority());
        analyzeEntity.setValue(dto.getValue());
        if(dto.getResource() == null){
            var result = new Long(0);
            analyzeEntity.setResource(result);
        }   
        analyzeEntity.setResource(dto.getResource());
       
        return analyzeEntity ;
    }

    public AnalyzeDTO saveAnalyze(AnalyzeDTO dto){

            AnalyzeEntity newAnalyzeEntity = build(dto);
            var result =  analyzeRepository.save(newAnalyzeEntity);
  
            return build(result) ;
    
}




public List<AnalyzeDTO> findByTaskId(Long task) {
    
    List<AnalyzeEntity> analysisFounded = analyzeRepository.findAnalysisByTask(task);
    List<AnalyzeDTO> resultAnalysis = new ArrayList<>();
    for(AnalyzeEntity e : analysisFounded){
        resultAnalysis.add(build(e));
    }

    return resultAnalysis ;
}

public List<AnalyzeDTO> verifyAnalysis(AnalyzeResponseDTO analyzeResponseDTO) {

    List<AnalyzeDTO> analyzeVerified= new ArrayList<>();

    for(AnalyzeDTO dto : analyzeResponseDTO.getAnalyze()){
        
       AnalyzeEntity analyzeEntity = analyzeRepository.findAnalyzeByEmployee(dto.getEmployee());
       analyzeEntity.setStatus(dto.getStatus());
       AnalyzeEntity result = analyzeRepository.saveAndFlush(analyzeEntity);
       analyzeVerified.add(build(result));
        }
        return analyzeVerified;
      
}

public List<AnalyzeDTO> findAnalysisByEmployeeAndStatus(Long id , String status){

    List<AnalyzeDTO> result = new ArrayList<>();
    var list = analyzeRepository.findAnalyzeByEmployeeAndStatus(id, status);

    for(AnalyzeEntity a : list){

        result.add(build(a));
    }
    return result ;
}



    public AnalyzeDTO findAnalyzeById(Long id){
        AnalyzeEntity result = analyzeRepository.findAnalyzeById(id);
        return build(result) ;
    }
    
    @Override
    public AnalyzeEntity create(AnalyzeEntity e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public AnalyzeEntity read(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public AnalyzeEntity update(Long id, AnalyzeEntity e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}