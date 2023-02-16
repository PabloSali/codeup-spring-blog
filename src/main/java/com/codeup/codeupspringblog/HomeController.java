package com.codeup.codeupspringblog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class HomeController {
    @GetMapping("/")
    @ResponseBody
    public String landing(){
        return "<h1> This is a landing page. </h1>";
    }
}
