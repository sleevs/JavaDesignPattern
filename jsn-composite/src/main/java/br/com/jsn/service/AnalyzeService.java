package br.com.jsn.service;

import org.springframework.stereotype.Service;

import br.com.jsn.dto.AnalyzeDTO;

import br.com.jsn.entity.AnalyzeEntity;


@Service
public class AnalyzeService implements CrudService<AnalyzeEntity>{ 

       public AnalyzeDTO build(AnalyzeEntity e){

        
        return null ;
    }

    public AnalyzeEntity build(AnalyzeDTO dto){


        return null ;
    }

    public AnalyzeDTO saveAnalyze(AnalyzeDTO dto){

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