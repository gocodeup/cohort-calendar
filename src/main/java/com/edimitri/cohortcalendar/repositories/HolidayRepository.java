package com.edimitri.cohortcalendar.repositories;

import com.edimitri.cohortcalendar.models.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface HolidayRepository extends JpaRepository<Holiday,Long> {
    Holiday findFirstByHolidayDate(LocalDate date);
}