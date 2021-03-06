package com.ges_school.scolaire.dao;


import com.ges_school.scolaire.entities.Classes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;


public interface ClassesRepository extends JpaRepository<Classes,Long> {

    @Query(value="select * from Classes c where c.id_classes=:y")
    public Classes findClassesById(@Param("y")Long id); 
}
