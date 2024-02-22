package br.com.jsn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jsn.dto.AnalyzeDTO;

import br.com.jsn.entity.AnalyzeEntity;
import br.com.jsn.repository.AnalyzeRepository;


@Service
public class AnalyzeService implements CrudService<AnalyzeEntity>{ 


    @Autowired
    AnalyzeRepository  analyzeRepository;


       public AnalyzeDTO build(AnalyzeEntity e){

        AnalyzeDTO analyzeDTO = new AnalyzeDTO();
        analyzeDTO.setAnalyst(e.getAnalyst());
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
      
        
        
        return analyzeDTO ;
    }

    public AnalyzeEntity build(AnalyzeDTO dto){

        AnalyzeEntity analyzeEntity = new AnalyzeEntity();
        analyzeEntity.setAnalyst(dto.getAnalyst());
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