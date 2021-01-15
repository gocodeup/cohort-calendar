package com.edimitri.cohortcalendar.repositories;

import com.edimitri.cohortcalendar.models.Cohort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CohortRepository extends JpaRepository<Cohort, Long> {
    Cohort findByName(String name);

    Cohort findByCampusAndProgramType(String campus, String programType);

    List<Cohort> findByProgramType(String programType);

    List<Cohort> findByCampus(String campus);

    List<Cohort> findAll();

}