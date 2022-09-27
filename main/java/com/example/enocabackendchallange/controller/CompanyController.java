package com.example.enocabackendchallange.controller;

import com.example.enocabackendchallange.entity.Company;
import com.example.enocabackendchallange.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")

public class CompanyController {

    @Autowired
    private ICompanyService companyService;
    public CompanyController(ICompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping
    public void create(@RequestBody Company company){
        companyService.create(company);
    }

    @PutMapping
    public void update(@RequestBody Company company){
        companyService.update(company);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        return companyService.delete(id);
    }

    @GetMapping
    public List<Company> getAll(){
        return companyService.getAll();
    }

    @GetMapping("/{id}")
    public Company getCompanyById(@PathVariable Long id){
        return companyService.getCompanyById(id);
    }

    @GetMapping("/check/{id}")
    public boolean checkCompanyIsExist(@PathVariable Long id){
        return companyService.checkCompanyIsExist(id);
    }

}
