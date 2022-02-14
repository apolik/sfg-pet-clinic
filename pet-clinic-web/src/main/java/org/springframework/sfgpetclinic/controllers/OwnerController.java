package org.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Polik on 2/12/2022
 */
@Controller
@RequestMapping("/owners")
public class OwnerController  {
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners() {
        return "owners/index";
    }
}
