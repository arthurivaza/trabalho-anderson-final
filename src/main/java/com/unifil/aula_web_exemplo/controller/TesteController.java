package com.unifil.aula_web_exemplo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TesteController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Index";
    }

}
