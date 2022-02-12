package org.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Polik on 2/12/2022
 */
@Controller
public class VetController {
    @RequestMapping({"/vets", "/vets/index", "vets/index.html"})
    public String listVets() {
        return "vets/index";
    }
}
