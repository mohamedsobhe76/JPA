package com.example.jpa.reosatory;

import com.example.jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
