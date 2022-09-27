package com.example.enocabackendchallange.dao;

import com.example.enocabackendchallange.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Long> {

}
