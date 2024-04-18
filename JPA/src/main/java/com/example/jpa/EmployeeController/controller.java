package com.example.jpa.EmployeeController;

import com.example.jpa.entity.Employee;
import com.example.jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class controller {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("{id}")
    public Employee findbyid(@PathVariable int id){
        return employeeService.findbyid(id);

    }
    @GetMapping("/all")
    public List<Employee> findall(){
        return  employeeService.findall();

    }
}
