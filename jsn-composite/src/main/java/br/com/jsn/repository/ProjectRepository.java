package br.com.jsn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.jsn.entity.ProjectEntity;
import java.util.List;


public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {
    

    @Query(value="SELECT * FROM project p WHERE p.projectReponsability = ?" , nativeQuery=true)
    public ProjectEntity findProjectByAccountId(Long id);



    @Query(value="SELECT * FROM project p WHERE p.project_id = ?" , nativeQuery=true)
    public ProjectEntity findProjectById(Long id);
}
