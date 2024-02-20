package br.com.jsn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jsn.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity , Long>{
    
}
