package org.springframework.sfgpetclinic.controllers;

import lombok.AllArgsConstructor;
import org.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Polik on 2/12/2022
 */
@Controller
@AllArgsConstructor
public class VetController {
    private final VetService vetService;

    @RequestMapping({"/vets", "/vets/index", "vets.html"})
    public String listVets(Model model) {
        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}
