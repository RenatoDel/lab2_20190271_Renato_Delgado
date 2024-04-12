package com.example.lab2gtics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomController {

    @GetMapping("/buscaminas")
    public String formularioPersona (){
        return "form";
    }
    @GetMapping("/jugar")
    public String formularioPersona (Model model){

        return "buscaminas.html";
    }




}
