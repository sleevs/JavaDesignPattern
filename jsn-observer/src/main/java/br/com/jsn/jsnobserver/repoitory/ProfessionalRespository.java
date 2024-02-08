package br.com.jsn.jsnobserver.repoitory;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jsn.jsnobserver.model.ProfessionalEntity;

@Repository
public interface ProfessionalRespository extends JpaRepository< ProfessionalEntity, Long>{
    
}
