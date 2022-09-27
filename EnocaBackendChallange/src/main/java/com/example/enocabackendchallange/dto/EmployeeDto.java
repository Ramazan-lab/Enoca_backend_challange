package com.example.enocabackendchallange.dto;

import com.example.enocabackendchallange.entity.Company;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

public class EmployeeDto {

    private Long id;

    private String name;

    private String companyName;

    private int age;

    private String salary;

    private int workingYear;
    private Long company_id;

    public EmployeeDto(Long id, String name, String companyName, int age, String salary, int workingYear, Long company_id) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.age = age;
        this.salary = salary;
        this.workingYear = workingYear;
        this.company_id = company_id;
    }

    public EmployeeDto(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public int getWorkingYear() {
        return workingYear;
    }

    public void setWorkingYear(int workingYear) {
        this.workingYear = workingYear;
    }

    public Long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Long company_id) {
        this.company_id = company_id;
    }
}


