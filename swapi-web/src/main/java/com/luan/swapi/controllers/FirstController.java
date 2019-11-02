package com.luan.swapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {

    @GetMapping("/first")
    public String first(@RequestParam(name="name", required=false, defaultValue="World")
        String name, Model model) {
        
        model.addAttribute("name", name);
        return "hello";
    }
}