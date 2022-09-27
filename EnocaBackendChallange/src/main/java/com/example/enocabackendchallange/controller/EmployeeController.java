package com.example.enocabackendchallange.controller;

import com.example.enocabackendchallange.dto.EmployeeDto;
import com.example.enocabackendchallange.entity.Employee;
import com.example.enocabackendchallange.service.IEmplooyeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")

public class EmployeeController {
    @Autowired
    private IEmplooyeService emplooyeService;

    public EmployeeController(IEmplooyeService emplooyeService) {
        this.emplooyeService = emplooyeService;
    }


    @PostMapping
    public ResponseEntity<EmployeeDto> create(@RequestBody EmployeeDto employee){
        emplooyeService.create(employee);
        return ResponseEntity.ok(employee);
    }

    @PutMapping
    public void update(@RequestBody EmployeeDto employee){
        emplooyeService.update(employee);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        return emplooyeService.delete(id);
    }

    @GetMapping
    public List<Employee> getAll(){
        return emplooyeService.getAll();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return emplooyeService.getEmployeeById(id);
    }

    @GetMapping("/check/{id}")
    public boolean checkEmployeeIsExist(@PathVariable Long id){
        return emplooyeService.checkEmpoyeeIsExist(id);
    }

    @GetMapping("/usersbycompany/{company_id}")
    public List<Employee> getEmployeeByCompanyId(@PathVariable Long company_id){
        return emplooyeService.getEmployeeByCompanyId(company_id);
    }
}
