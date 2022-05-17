package com.viruta.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CompaniesController {

    private List<String> companies;

    public CompaniesController() {

        companies = new ArrayList<>();

        companies.add("ChildrenWater");
        companies.add("ChildrenFoundation");
        companies.add("AfricaMia");
        companies.add("Chinese Children");
    }

    @GetMapping("/companies")
    public List<String> findAll() {
        return companies;
    }

    @GetMapping("/companies/{id}")
    public String findById(@PathVariable("id") String id) {
        for(String company: companies) {
            if(company.equals(id)) {
                return company;
            }
        }
        return null;
    }

    @PostMapping("/companies")
    public String createNewCompany(@RequestBody String companyName) {
        companies.add(companyName);
        return companyName;
    }

    @PostMapping("/companies/{id}/addMoney")
    public String addMoneyToCompany(@PathVariable("id") String id, @RequestBody Integer amount) {
        // add money to company

        System.out.println("I just added " + amount.toString() + " to Company" + id);

        return "Todo Fresa";
    }
}
