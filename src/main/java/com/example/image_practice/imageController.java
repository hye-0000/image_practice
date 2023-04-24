package com.example.image_practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class imageController {
    @GetMapping("/")
    @ResponseBody
    public String response(){
        return "Hello world";
    }
}
