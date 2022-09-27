package com.example.enocabackendchallange.dao;

import com.example.enocabackendchallange.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Employee> getEmployeeByCompanyId(Long company_id);

}
