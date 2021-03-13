package com.example.lombok1.Controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controler2 {
    @RequestMapping("/demo")
    public String  display()
    {
        return "web";
    }
}
