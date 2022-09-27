package com.example.enocabackendchallange.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Table(name="employee")
public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "category_generator")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="companyname")
    private String companyName;

    @Column(name="age")
    private int age;

    @Column(name="salary")
    private String salary;

    @Column(name="workingYear")
    private int workingYear;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="company_id",referencedColumnName = "id")
    private Company company;


    public Employee(Long id, String name, String companyName, int age, String salary, int workingYear,Company company) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.age = age;
        this.salary = salary;
        this.workingYear = workingYear;
        this.company=company;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Employee(){

    }

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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
