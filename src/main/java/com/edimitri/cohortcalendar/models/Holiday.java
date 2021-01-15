package com.edimitri.cohortcalendar.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "holidays")
public class Holiday {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String holidayName;

    @Column(nullable=false, unique=true)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate holidayDate;

    public Holiday(){}

    public Holiday(String holidayName, LocalDate holidayDate) {
        this.holidayName = holidayName;
        this.holidayDate = holidayDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHolidayName() {
        return holidayName;
    }

    public void setHolidayName(String name) {
        this.holidayName = name;
    }

    public LocalDate getHolidayDate() {
        return holidayDate;
    }

    public void setHolidayDate(LocalDate date) {
        this.holidayDate = date;
    }

}
