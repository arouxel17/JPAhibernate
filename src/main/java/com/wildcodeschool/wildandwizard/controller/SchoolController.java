package com.wildcodeschool.wildandwizard.controller;

import com.wildcodeschool.wildandwizard.entity.School;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import com.wildcodeschool.wildandwizard.repository.SchoolRepository;

@Controller
public class SchoolController {

    // TODO : get school repository by dependency injection
    @Autowired
    private SchoolRepository repository;

    @GetMapping("/schools")
    public String getAll(Model model) {
        model.addAttribute("schools", repository.findAll());
        return "schools";
    }

    @GetMapping("/school")
    public String getSchool(Model model,
                            @RequestParam(required = false) Long id) {

        School school = new School();
        if (id != null) {
            school = repository.findById(id).get();
        }
        model.addAttribute("school", school);
        return "school";
    }

    @PostMapping("/school")
    public String postSchool(@ModelAttribute School school) {

        // TODO : save school
        

        return "redirect:/schools";
    }

    @GetMapping("/school/delete")
    public String deleteSchool(@RequestParam Long id) {

        // TODO : delete a school

        return "redirect:/schools";
    }
}
