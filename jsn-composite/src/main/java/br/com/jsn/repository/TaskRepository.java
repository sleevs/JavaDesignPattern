package br.com.jsn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jsn.entity.TaskEntity;

public interface TaskRepository extends JpaRepository<TaskEntity, Long>{
    
}
