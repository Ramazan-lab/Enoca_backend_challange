package com.example.enocabackendchallange.dao;

import java.util.List;
import java.util.Set;

public interface ICompanyDal <Type>{
    void create(Type t);
    void update(Type t);
    String delete(Long id);
    List<Type> getAll();
    Type getCompanyById(Long id);
    boolean checkCompanyIsExist(Long id);

}

