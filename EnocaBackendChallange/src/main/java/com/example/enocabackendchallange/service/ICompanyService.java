package com.example.enocabackendchallange.service;

import com.example.enocabackendchallange.entity.Company;

import java.util.List;

public interface ICompanyService <Type>{
    void create(Type t);//done
    void update(Type t);//done
    String delete(Long id);//done
    List<Type> getAll();//done
    Company getCompanyById(Long id);//done
    boolean checkCompanyIsExist(Long id);//done
}
