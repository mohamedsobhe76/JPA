package com.example.jpa.service;

import com.example.jpa.entity.Employee;
import com.example.jpa.reosatory.EmplyeeRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    private EmplyeeRepo emplyeeRepo;
    public Employee findbyid(int id){
        return emplyeeRepo.findById(id).orElseThrow();
    }
}
