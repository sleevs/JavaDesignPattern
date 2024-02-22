package br.com.jsn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jsn.dto.EmployeeDTO;
import br.com.jsn.entity.EmployeeEntity;
import br.com.jsn.repository.EmployeeRepository;

@Service
public class EmployeeService implements CrudService<EmployeeEntity> {


    @Autowired
    private EmployeeRepository employeeRepository;


    public List<EmployeeDTO> findEmployees(String param){

        List<EmployeeDTO>  listOutput = new ArrayList<>();
        List<EmployeeEntity> listInput = employeeRepository.findEmployeesByType(param);
        for(EmployeeEntity e : listInput){
            listOutput.add(build(e));
        }

        return listOutput ;
    }

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



    private  EmployeeDTO build(EmployeeEntity e){

        EmployeeDTO dto = new EmployeeDTO();
        dto.setId(e.getEmployeeId());
        dto.setCertification(e.getEmployeeCertification());
        dto.setExperience(e.getEmployeeExperience());
        dto.setSkills(e.getEmployeeSkills());
        dto.setName(e.getEmployeeName());
        dto.setPhone(e.getEmployeePhone());
        dto.setType(e.getEmployeeType());
        dto.setEmail(e.getEmployeeEmail());
        return dto;
    }


    public  EmployeeEntity buildEntity(EmployeeDTO dto){


        return  employeeRepository.findEmployeesById(dto.getId());
       
    }


    public  EmployeeDTO findEmployeeById(Long id){
        var result = employeeRepository.findEmployeesById(id);
        System.out.println(result);
        return  build(result);
       
    }
   
   
    
}
