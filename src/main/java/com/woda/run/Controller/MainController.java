package com.woda.run.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class MainController {

    @GetMapping
    public String index(){
        return "index";
    }
}
