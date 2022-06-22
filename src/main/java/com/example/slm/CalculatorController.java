package com.example.slm;


import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {
    private Calculator calc = new Calculator();

    @GetMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b) {
        return calc.sum(a,b);
    }

    @GetMapping("/divide")
    public int division(@RequestParam int a, @RequestParam int b) {
        return calc.division(a,b);
    }

    @GetMapping("/convertInches")
    public double convertInchesToCm(@RequestParam double a) {
        return calc.convertInchesToCm(a);
    }
}
