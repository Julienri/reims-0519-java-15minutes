package com.quinzeminutespourmoi.quinzePourMoi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.quinzeminutespourmoi.quinzePourMoi.entities.Survey;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long>{
    
}