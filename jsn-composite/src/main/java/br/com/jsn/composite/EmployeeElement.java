package br.com.jsn.composite;

import br.com.jsn.dto.EmployeeDTO;


public class EmployeeElement extends ManagerComponent{

    private EmployeeDTO employeeDTO;
    
public  EmployeeElement (EmployeeDTO employeeDTO){
    this.employeeDTO = employeeDTO;
}
    @Override
    public Object display() {
        
        return employeeDTO;
    }

    
    public EmployeeDTO getEmployeeDTO() {
        return employeeDTO;
    }
    public void setEmployeeDTO(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }

    
    
    
}
