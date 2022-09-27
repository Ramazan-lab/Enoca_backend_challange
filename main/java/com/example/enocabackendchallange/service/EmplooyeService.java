package com.example.enocabackendchallange.service;

import com.example.enocabackendchallange.dao.CompanyRepository;
import com.example.enocabackendchallange.dao.EmployeeRepository;
import com.example.enocabackendchallange.dao.IEmployeeDal;
import com.example.enocabackendchallange.dto.EmployeeDto;
import com.example.enocabackendchallange.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmplooyeService implements IEmplooyeService<Employee>{
    @Autowired
    private IEmployeeDal employeeDal;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ICompanyService companyService;


    public EmplooyeService(IEmployeeDal employeeDal,EmployeeRepository employeeRepository,ICompanyService companyService) {
        this.employeeDal = employeeDal;
        this.employeeRepository=employeeRepository;
        this.companyService=companyService;
    }



    @Override
    public void create(EmployeeDto t) {
       Employee employee=new Employee();
        employee.setAge(t.getAge());
        employee.setId(t.getId());
        employee.setName(t.getName());
        employee.setSalary(t.getSalary());
        employee.setCompanyName(t.getCompanyName());
        employee.setWorkingYear(t.getWorkingYear());
        employee.setCompany(companyService.getCompanyById(t.getCompany_id()));

        this.employeeDal.create(employee);
    }

    @Override
    public void update(EmployeeDto t) {
        Employee employee=new Employee();
        employee.setAge(t.getAge());
        employee.setId(t.getId());
        employee.setName(t.getName());
        employee.setSalary(t.getSalary());
        employee.setCompanyName(t.getCompanyName());
        employee.setWorkingYear(t.getWorkingYear());
        employee.setCompany(companyService.getCompanyById(t.getCompany_id()));

        this.employeeDal.create(employee);   }

    @Override
    public String delete(Long id) {

        return this.employeeDal.delete(id);
    }

    @Override
    public List<Employee> getAll() {
       List<Employee>employeeList=this.employeeDal.getAll().stream().toList();
        for (Employee temp:employeeList){
            double em=Double.parseDouble(temp.getSalary());

            if (temp.getAge()>20 && temp.getAge()<25){
                em*=1.1;
            } else if (temp.getAge()>26 && temp.getAge()<30) {
                em*=1.08;
            } else if (temp.getAge()>31 && temp.getAge()<36) {
                em*=1.05;
            } else if (temp.getAge()>36) {
                em*=1.03;
            }
            double currentSalary=((temp.getWorkingYear()*0.1)*em)+em;
            String currentSalarystr=String.valueOf(currentSalary);
            temp.setSalary(currentSalarystr);
        }
        return this.employeeDal.getAll();

    }

    @Override
    public Employee getEmployeeById(Long id) {
        return (Employee) this.employeeDal.getEmployeeById(id);
    }

    @Override
    public boolean checkEmpoyeeIsExist(Long id) {
        return this.employeeDal.checkEmpoyeeIsExist(id);
    }

    @Override
    public List<Employee> getEmployeeByCompanyId(Long company_id) {
        return this.employeeRepository.getEmployeeByCompanyId(company_id);
    }
}
