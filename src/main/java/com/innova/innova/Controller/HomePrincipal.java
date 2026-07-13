package com.innova.innova.Controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomePrincipal {
    
    @GetMapping("/")
    public String index(){
        return "Home";
    }

}
