package br.com.jsn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.jsn.entity.ActionEntity;

public interface ActionRepository extends JpaRepository<ActionEntity, Long> {
    

    @Query(value="SELECT * FROM action a WHERE a.action_id = ?" , nativeQuery=true)
    public ActionEntity findActionById(Long id);

    @Query(value="SELECT * FROM action a WHERE a.task_id = ?" , nativeQuery=true)
    public List<ActionEntity> findActionsByTaskId(Long id);

}
