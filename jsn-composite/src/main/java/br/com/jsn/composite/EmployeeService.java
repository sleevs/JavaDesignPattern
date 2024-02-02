package br.com.jsn.composite;

import br.com.jsn.dto.EmployeeDTO;

public class EmployeeService extends ProjectElement{

    private EmployeeDTO employeeDTO;
    
public  EmployeeService (EmployeeDTO employeeDTO){
    this.employeeDTO = employeeDTO;
}
    @Override
    public Object display() {
        System.out.println(" EMPLOYEE " + employeeDTO);
        return employeeDTO;
    }
    
    
}
