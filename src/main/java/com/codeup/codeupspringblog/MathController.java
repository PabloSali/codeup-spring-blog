package com.codeup.codeupspringblog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class MathController {
    // Add
    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    // Subtract
    @GetMapping("/add/{num1}/from/{num2}")
    @ResponseBody
    public int sub(int num1, int num2){
        return num1 - num2;
    }
    // Multiply
    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public int mult(int num1, int num2){
        return num1 * num2;
    }
    // Divide
    @GetMapping("/add/{num1}/from/{num2}")
    @ResponseBody
    public int div(int num1, int num2){
        return num1 / num2;
    }
}
