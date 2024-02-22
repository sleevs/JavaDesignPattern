package br.com.jsn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import br.com.jsn.entity.AnalyzeEntity;

public interface AnalyzeRepository extends JpaRepository<AnalyzeEntity,Long>{



    @Query(value="SELECT * FROM analyzer a WHERE a.analyze_id = ?" , nativeQuery=true)
    public AnalyzeEntity findAnalyzeById(Long id);

    
}
