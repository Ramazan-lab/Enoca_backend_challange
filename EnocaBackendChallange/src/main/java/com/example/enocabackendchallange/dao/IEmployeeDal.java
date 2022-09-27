package com.example.enocabackendchallange.dao;

import com.example.enocabackendchallange.entity.Employee;

import java.util.List;
import java.util.Set;

public interface IEmployeeDal <Type>{
    void create(Type t);
    void update(Type t);
    String delete(Long id);//done
    List<Type> getAll();//done
    Type getEmployeeById(Long id);//done
    boolean checkEmpoyeeIsExist(Long id);//done
}
