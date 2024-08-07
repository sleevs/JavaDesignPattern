package br.com.jsn.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jsn.dto.EmployeeDTO;
import br.com.jsn.entity.EmployeeEntity;
import br.com.jsn.repository.EmployeeRepository;
import br.com.jsn.util.DateUtil;

@Service
public class EmployeeService implements CrudService<EmployeeEntity> {


    @Autowired
    private EmployeeRepository employeeRepository;


    public List<EmployeeDTO> findEmployeesByType(String param){

        List<EmployeeDTO>  listOutput = new ArrayList<>();
        List<EmployeeEntity> listInput = employeeRepository.findEmployeesByType(param);
        for(EmployeeEntity e : listInput){
            listOutput.add(build(e));
        }

        return listOutput ;
    }

    public EmployeeDTO saveEmployee(EmployeeDTO dtoEmployee){
            Date dateNow = new Date();
            EmployeeEntity entity = build(dtoEmployee);
            entity.setEmployeeDateTime(dateNow);
            var dto = employeeRepository.save(entity);
        return build(dto) ;
    }

public  EmployeeDTO findEmployeeById(Long id){
    var result = employeeRepository.findEmployeesById(id);
    System.out.println(result);
    return  build(result);
   
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

        var dto = new EmployeeDTO();
        dto.setId(e.getEmployeeId());
        dto.setCertification(e.getEmployeeCertification());
        dto.setExperience(e.getEmployeeExperience());
        dto.setSkills(e.getEmployeeSkills());
        dto.setName(e.getEmployeeName());
        dto.setPhone(e.getEmployeePhone());
        dto.setType(e.getEmployeeType());
        dto.setEmail(e.getEmployeeEmail());
        if(e.getEmployeeDateTime() != null){
            dto.setDate(DateUtil.formatDate(e.getEmployeeDateTime()));
            
        }
        return dto;
    }


    private  EmployeeEntity build(EmployeeDTO dto){

        var employeeEntity = new EmployeeEntity();
        employeeEntity.setEmployeeCertification(dto.getCertification());
        employeeEntity.setEmployeeEmail(dto.getEmail());
        employeeEntity.setEmployeeExperience(dto.getExperience());
        employeeEntity.setEmployeePhone(dto.getPhone());
        employeeEntity.setEmployeeName(dto.getName());
        employeeEntity.setEmployeeSkills(dto.getSkills());
        employeeEntity.setEmployeeType(dto.getType());


        return employeeEntity;
       
    }


  

 
   
   
    
}
