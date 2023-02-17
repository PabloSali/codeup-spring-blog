package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

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

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/join")
    public String showJoinForm() {
        return "join";
    }

    @PostMapping("/join")
    public String joinCohort(@RequestParam(name = "cohort") String cohort, Model model) {
        model.addAttribute("cohort", "Welcome to " + cohort + "!");
        return "join";
    }

}
