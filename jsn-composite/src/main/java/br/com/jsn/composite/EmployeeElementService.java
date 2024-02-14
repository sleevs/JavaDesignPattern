package br.com.jsn.composite;

import br.com.jsn.dto.EmployeeDTO;

public class EmployeeElementService extends ProjectComponent{

    private EmployeeDTO employeeDTO;
    
public  EmployeeElementService (EmployeeDTO employeeDTO){
    this.employeeDTO = employeeDTO;
}
    @Override
    public Object display() {
        System.out.println(" EMPLOYEE " + employeeDTO);
        return employeeDTO;
    }
    
    
}
