package br.com.jsn.service;

import org.springframework.stereotype.Service;

import br.com.jsn.dto.EmployeeDTO;
import br.com.jsn.entity.EmployeeEntity;

@Service
public class EmployeeService implements CrudService<EmployeeEntity> {





    public EmployeeDTO saveEmployee(EmployeeDTO e){

        return null ;
    }

    @Override
    public EmployeeEntity create(EmployeeEntity e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public EmployeeEntity read(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public EmployeeEntity update(Long id, EmployeeEntity e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
