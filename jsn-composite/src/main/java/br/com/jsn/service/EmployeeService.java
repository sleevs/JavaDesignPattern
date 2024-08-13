package br.com.jsn.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.jsn.dto.EmployeeDTO;
import br.com.jsn.entity.EmployeeEntity;
import br.com.jsn.repository.EmployeeRepository;
import br.com.jsn.util.DtoMapper;

@Service
public class EmployeeService implements CrudService<EmployeeEntity> {


    @Autowired
    private EmployeeRepository employeeRepository;


    @Autowired
    private DtoMapper dtoMapper;

    public List<EmployeeDTO> findEmployeesByType(String param){

        List<EmployeeDTO>  listOutput = new ArrayList<>();
        List<EmployeeEntity> listInput = employeeRepository.findEmployeesByType(param);
        for(EmployeeEntity e : listInput){
            listOutput.add(dtoMapper.buildEmployeeDTO(e));
        }

        return listOutput ;
    }

    public EmployeeDTO saveEmployee(EmployeeDTO dtoEmployee){
            Date dateNow = new Date();
            EmployeeEntity entity = dtoMapper.buildEmployeeEntity(dtoEmployee);
            entity.setEmployeeDateTime(dateNow);
            var dto = employeeRepository.save(entity);
        return dtoMapper.buildEmployeeDTO(dto) ;
    }

public  EmployeeDTO findEmployeeById(Long id){
    var result = employeeRepository.findEmployeesById(id);
    System.out.println(result);
    return  dtoMapper.buildEmployeeDTO(result);
   
}

public List<EmployeeDTO> listEmployees(){

    List<EmployeeDTO>  listOutput = new ArrayList<>();
    List<EmployeeEntity> listInput = employeeRepository.findAll();
    for(EmployeeEntity e : listInput){
        listOutput.add(dtoMapper.buildEmployeeDTO(e));
    }

    return listOutput ;
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
