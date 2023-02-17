package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class MathController {
    // Add
    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public String add(int num1, int num2) { return "<h1> Math: " + (num1 + num2) + "! </h1>"; }
    // Subtract
    @GetMapping("/sub/{num1}/from/{num2}")
    @ResponseBody
    public String sub(int num1, int num2){ return "<h1> Math: " + (num2 - num1) + "! </h1>"; }
    // Multiply
    @GetMapping("/mul/{num1}/and/{num2}")
    @ResponseBody
    public String mult(int num1, int num2){ return "<h1> Math: " + (num1 * num2) + "! </h1>"; }
    // Divide
    @GetMapping("/div/{num1}/from/{num2}")
    @ResponseBody
    public String div(int num1, int num2){ return "<h1> Math: " + (num2 / num1) + "! </h1>"; }
}
