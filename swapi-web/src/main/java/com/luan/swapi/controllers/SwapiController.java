package com.luan.swapi.controllers;

import com.luan.swapi.dao.SwapiDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path = "/api")
public class SwapiController {

    @Autowired
    SwapiDao swapiDao;
    
    @GetMapping(path = "/jdtest")
    public String jdTest(
        @RequestParam(name = "filmId", required=true) String filmId,
        @RequestParam(name = "characterId", required=true) String characterId) {

        swapiDao.getTest();

        return "filmId: " + filmId + " - characterId: " + characterId;

    }

}