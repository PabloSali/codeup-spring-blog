package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "<h1> Hello from Spring </h1>";
    }

    @RequestMapping(path = "/color", method = RequestMethod.GET)
    @ResponseBody
    public String color(){
        return "blue";
    }

//    @GetMapping
//    @PostMapping
//    @PutMapping
//    @DeleteMapping
//    @RequestMapping

    @GetMapping("/hello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name) {
        return "<h1> Hello " + name + "! </h1>";
    }

}
