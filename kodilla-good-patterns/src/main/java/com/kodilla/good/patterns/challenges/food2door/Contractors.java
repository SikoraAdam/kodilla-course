package com.kodilla.good.patterns.challenges.food2door;

import java.util.*;

public class Contractors {

    Map<String, Company> contractors = new HashMap<>();

    public Contractors(Map<String, Company> contractors) {
        this.contractors = contractors;
    }

    public Company getCompany(String company)
    {
        return contractors.get(company);
    }

    public void addCompany(Company company)
    {
        contractors.put(company.getName(), company);
    }

    public Map<String, Company> getContractors() {
        return contractors;
    }
}
