package br.com.jsn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.jsn.entity.EmployeeEntity;
import java.util.List;
public interface EmployeeRepository extends JpaRepository<EmployeeEntity , Long>{
 
    
    @Query(value="SELECT * FROM employee e WHERE e.employee_type = ?" , nativeQuery=true)
    public List<EmployeeEntity> findEmployeesByType(String param);

    @Query(value="SELECT * FROM employee e WHERE e.employee_id = ?" , nativeQuery=true)
    public EmployeeEntity findEmployeesById(Long id);
}
