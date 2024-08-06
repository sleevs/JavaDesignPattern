package br.com.jsn.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jsn.dto.AnalyzeDTO;

import br.com.jsn.entity.AnalyzeEntity;
import br.com.jsn.repository.AnalyzeRepository;
import br.com.jsn.util.DateUtil;


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
        analyzeDTO.setValue(e.getValue());
        analyzeDTO.setId(e.getAnalyzeId());
        analyzeDTO.setEstimate(e.getAnalyzeEstimate());
        analyzeDTO.setProject(e.getProject());
        
        if(e.getAnalyzeDate() != null){
            analyzeDTO.setDate(DateUtil.formatDate(e.getAnalyzeDate()));
        }
        
        return analyzeDTO ;
    }

    private AnalyzeEntity build(AnalyzeDTO dto){
        Date dateNow = new Date();
        AnalyzeEntity analyzeEntity = new AnalyzeEntity();
        analyzeEntity.setEmployee(dto.getEmployee());
        analyzeEntity.setAnalyzeDate(dateNow);
        analyzeEntity.setComplexity(dto.getComplexity());
        analyzeEntity.setCost(dto.getCost());
        analyzeEntity.setStatus("PROCESSING BY CLIENT");
        analyzeEntity.setValue(dto.getValue());
        analyzeEntity.setAnalyzeEstimate(dto.getEstimate());
        analyzeEntity.setProject(dto.getProject());
       
        return analyzeEntity ;
    }

    public AnalyzeDTO saveAnalyze(AnalyzeDTO dto){

            AnalyzeEntity newAnalyzeEntity = build(dto);
            var result =  analyzeRepository.save(newAnalyzeEntity);
  
            return build(result) ;
    
}


public AnalyzeDTO findAnalysisByTaskId(Long task) {
    
    if(task != null){

    AnalyzeEntity result = analyzeRepository.findAnalysisByTask(task);
    
    return build(result); 
    }
    return  null ;
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


    public List<AnalyzeDTO> findAnalysisByProjectId(Long id){
        
        if(id != null){
            List<AnalyzeEntity> listResult = analyzeRepository.findAnalysisByProjectId(id);
        List<AnalyzeDTO> listAnalyzeDTO = new ArrayList<>();
        
        for(AnalyzeEntity entity : listResult){
            listAnalyzeDTO.add(build(entity));
        }
        return listAnalyzeDTO ;
        }
        return null ;
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