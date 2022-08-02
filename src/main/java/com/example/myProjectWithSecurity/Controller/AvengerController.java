package com.example.myProjectWithSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AvengerController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD.";
    }

    @GetMapping("/avengers/assemble")
    public String champion() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String secretBases() {
        return "liste de toutes les villes où il y a une Wild Code School: " +
                "Biarritz, Bordeaux, Lyon , Lille , " +
                "Marseille ,La loupe ,Amsterdam, Paris , Barcelone" +
                "Lisbonne Bruxelle, Berlin";

    }
}