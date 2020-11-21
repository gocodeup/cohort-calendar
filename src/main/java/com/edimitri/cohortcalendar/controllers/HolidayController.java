package com.edimitri.cohortcalendar.controllers;

import com.edimitri.cohortcalendar.models.Cohort;
import com.edimitri.cohortcalendar.models.Holiday;
import com.edimitri.cohortcalendar.repositories.HolidayRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HolidayController {

    private HolidayRepository holidayRepository;

    public HolidayController(HolidayRepository holidayRepository) {
        this.holidayRepository = holidayRepository;
    }

    @GetMapping("/holidays")
    public String cohortsIndex(Model model) {
        List<Holiday> holidays = holidayRepository.findAll();
        model.addAttribute("holidays", holidays);
        return "holidays/holidays";
    }
/*
    @GetMapping("/holidays")
    public String showAddHolidayForm(Model model) {
        model.addAttribute("holiday", new Holiday());
        return "holidays";
    }


 */
    @GetMapping("/holidays/edit")
    public String showEditHolidayForm(Model model){
        model.addAttribute("cohort",new Cohort());
        return "holidays/edit";
    }
    @PostMapping("/holidays")
    public String saveHoliday(@ModelAttribute Holiday holiday) {
        holidayRepository.save(holiday);
        return "redirect:/holidays";
    }
}


