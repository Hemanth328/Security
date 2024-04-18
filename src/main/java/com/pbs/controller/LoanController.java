package com.pbs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/myloans")
    public String myLoanDetails() {
        return "Here are the my Loan Details from DB";
    }
}
