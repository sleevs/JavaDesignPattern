package br.com.jsn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import br.com.jsn.entity.AnalyzeEntity;

public interface AnalyzeRepository extends JpaRepository<AnalyzeEntity,Long>{



    @Query(value="SELECT * FROM analysis a WHERE a.analyze_id = ?" , nativeQuery=true)
    public AnalyzeEntity findAnalyzeById(Long id);


    @Query(value="SELECT * FROM analysis a WHERE a.task_id = ?" , nativeQuery=true)
    public List<AnalyzeEntity> findAnalysisByTask(Long id);

    @Query(value="SELECT * FROM analysis a WHERE a.employee_id = ?" , nativeQuery=true)
    public AnalyzeEntity findAnalyzeByEmployee(Long id);


    @Query(value="SELECT * FROM analysis a WHERE a.employee_id = ?1 AND a.analyze_status = ?2" , nativeQuery=true)
    public List<AnalyzeEntity> findAnalyzeByEmployeeAndStatus(Long id, String status);


   
    @Query(value="SELECT * FROM analysis a WHERE a.project_id = ?" , nativeQuery=true)
    public List<AnalyzeEntity> findAnalysisByProjectId(Long id);



    
}
