package com.Swagger02.Swagger02.controllers;

import com.Swagger02.Swagger02.entities.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("")
    @ApiOperation(value = "Welcome message", notes = "The method returns a message")
    public String welcomeMathMsg() {
        return "Welcome to Math";
    }

    @GetMapping("/division-info")
    @ApiOperation(value = "Division details", notes = "The method returns a info for division")
    public ArithmeticOperation details() {
        return new ArithmeticOperation(
                "Division",
                2,
                "Division is the opposite of multiplication. If 3 groups of 4 make 12 in multiplication, " +
                        "12 divided into 3 equal groups give 4 in each group in division.",
                new String[]{
                        "Dividend: The dividend is the number that is being divided in the division process.",
                        "Divisor: The number by which the dividend is being divided by is called the divisor.",
                        "Quotient: The quotient is a result obtained in the division process.",
                        "Remainder: Sometimes, we cannot divide things exactly. There may be a leftover number."
                });
    }


    @GetMapping("/multiplication")
    @ApiOperation(value = "Operation of the multiplication", notes = "The method returns a multiplication between two number")
    public int product(@RequestParam int a, int b) {
        return a * b;
    }


    @GetMapping("/square/{n}")
    @ApiOperation(value = "Square of a number", notes = "The method returns a square of a number")
    public int square(@PathVariable int n) {
        return n * n;
    }
}
