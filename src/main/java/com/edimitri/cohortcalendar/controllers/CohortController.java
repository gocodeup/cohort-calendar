package com.edimitri.cohortcalendar.controllers;

import com.edimitri.cohortcalendar.models.Cohort;
import com.edimitri.cohortcalendar.repositories.CohortRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CohortController {

    private CohortRepository cohortRepository;

    public CohortController(CohortRepository cohortRepository) {
        this.cohortRepository = cohortRepository;
    }

    @GetMapping("/cohorts")
    public String showAddCohortForm(Model model) {
        model.addAttribute("cohort", new Cohort());
        return "cohorts";
    }

    @PostMapping("/cohorts")
    public String saveCohort(@ModelAttribute Cohort cohort) {
    return "cohorts";
    }
}