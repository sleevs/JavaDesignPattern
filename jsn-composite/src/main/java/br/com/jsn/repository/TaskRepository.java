package br.com.jsn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import br.com.jsn.entity.TaskEntity;

public interface TaskRepository extends JpaRepository<TaskEntity, Long>{
    

    @Query(value="SELECT * FROM task t WHERE t.project_id = ?" , nativeQuery=true)
    public List<TaskEntity> findTasksByProjectId(Long id);



    @Query(value="SELECT * FROM task t WHERE t.task_id = ?" , nativeQuery=true)
    public TaskEntity findTaskById(Long id);

    @Query(value="SELECT * FROM task t WHERE t.analyze_id = ?" , nativeQuery=true)
    public List<TaskEntity> findTaskByAnalysisId(Long id);
}
