package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RollDice {
    @GetMapping("/roll-dice")
    public String rollDice(){
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{num}")
    public String userInput(@PathVariable int num, Model model) {
        int randomNum = (int) Math.floor(Math.random() * 6) + 1;

        boolean result = num == randomNum;

        model.addAttribute("result" , result);
        model.addAttribute("randomNum" , randomNum);
        model.addAttribute("userGuess", num);

        return "roll-dice";
    }

}
