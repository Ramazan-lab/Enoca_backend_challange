package com.example.enocabackendchallange.service;

import com.example.enocabackendchallange.dto.EmployeeDto;
import com.example.enocabackendchallange.entity.Employee;

import java.util.List;

public interface IEmplooyeService <Type>{
    void create(EmployeeDto t);
    void update(EmployeeDto t);
    String delete(Long id);//done
    List<Type> getAll();//done
    Employee getEmployeeById(Long id);//done
    boolean checkEmpoyeeIsExist(Long id);//done
    List<Employee> getEmployeeByCompanyId(Long company_id);//done


}
