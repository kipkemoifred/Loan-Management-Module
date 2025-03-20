package com.example.Loan_Management_Module.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoanController {
    @PostMapping("/subscription")
    public String subscription(@RequestParam String customerNumber) {
        //todo submit a Customer Number
        return customerNumber;
    }
    @PostMapping("/loanRequest")
    public String loanRequest(@RequestParam String customerNumber, @RequestParam String loanAmount) {
        //todo submit a customer Number and amount
        return customerNumber+" "+loanAmount;
    }
    @GetMapping("/loanStatus")
    public String loanStatus() {
        //todo query for the loan status.
        return "Hello, World!";
    }
}
