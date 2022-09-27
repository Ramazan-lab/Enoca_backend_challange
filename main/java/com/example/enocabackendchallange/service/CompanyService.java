package com.example.enocabackendchallange.service;

import com.example.enocabackendchallange.dao.ICompanyDal;
import com.example.enocabackendchallange.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService implements ICompanyService<Company>{

    @Autowired
    private ICompanyDal companyDal;
    public CompanyService(ICompanyDal companyDal) {
        this.companyDal = companyDal;
    }



    @Override
    public void create(Company t) {

        this.companyDal.create(t);
    }

    @Override
    public void update(Company t) {
        this.companyDal.update(t);
    }

    @Override
    public String delete(Long id) {

        return this.companyDal.delete(id);
    }

    @Override
    public List<Company> getAll() {
        return this.companyDal.getAll();
    }

    @Override
    public Company getCompanyById(Long id) {
        return (Company) this.companyDal.getCompanyById(id);
    }

    @Override
    public boolean checkCompanyIsExist(Long id) {
        return this.companyDal.checkCompanyIsExist(id);
    }
}
