package com.example.enocabackendchallange.dao;

import com.example.enocabackendchallange.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;
@Repository
public class CompanyDal implements ICompanyDal<Company>{
    @Autowired
    private CompanyRepository companyRepository;

    public CompanyDal(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public void create(Company t) {
        companyRepository.save(t);
    }

    @Override
    public void update(Company t) {
        companyRepository.save(t);
    }

    @Override
    public String delete(Long id) {
        try {
            companyRepository.deleteById(id);
        }catch (Exception e){
            return"veri bulunamadı";
        }
            return null;
    }

    @Override
    public List<Company> getAll() {
        return companyRepository.findAll();
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    @Override
    public boolean checkCompanyIsExist(Long id) {
       Company company= companyRepository.findById(id).orElse(null);
        if (company!=null)
            return true;
        return false;
    }
}
