package Examen01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controler


public class IndexController {
    @GetMapping("/")
    public String inciio(){
        log.info("");
        return "index";
    }
    
}
