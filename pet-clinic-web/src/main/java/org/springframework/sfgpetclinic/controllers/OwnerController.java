package org.springframework.sfgpetclinic.controllers;

import lombok.AllArgsConstructor;
import org.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Polik on 2/12/2022
 */
@Controller
@RequestMapping("/owners")
@AllArgsConstructor
public class OwnerController  {
    private final OwnerService ownerService;

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String getAll(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }

    @RequestMapping({"/find"})
    public String findOwners() {
        return "notimplemented";
    }
}
