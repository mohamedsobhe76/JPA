package com.example.jpa.service;

import com.example.jpa.entity.Employee;
import com.example.jpa.reosatory.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    public Employee findbyid(int id){
        return employeeRepo.findById(id).orElseThrow();
    }
    public List<Employee> findall(){

        return employeeRepo.findAll();

    }
}
