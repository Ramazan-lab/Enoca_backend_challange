package com.example.enocabackendchallange.dao;

import com.example.enocabackendchallange.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDal implements IEmployeeDal<Employee>{
    @Autowired
    private EmployeeRepository employeeRepository;
    public EmployeeDal(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }



    @Override
    public void create(Employee t) {
        employeeRepository.save(t);
    }

    @Override
    public void update(Employee t) {
        employeeRepository.save(t);
    }

    @Override
    public String delete(Long id) {
        try{
        employeeRepository.deleteById(id);
        }
        catch (Exception e){
            return "veri bulunamadı";
        }
        return null;
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public boolean checkEmpoyeeIsExist(Long id) {
        Employee employee=employeeRepository.findById(id).orElse(null);
        if (employee!=null)
            return true;
        return false;
    }


    public List<Employee> getEmployeeByCompanyId(Long company_id) {
        List<Employee> employees=employeeRepository.getEmployeeByCompanyId(company_id);
        return employees;
    }
}
