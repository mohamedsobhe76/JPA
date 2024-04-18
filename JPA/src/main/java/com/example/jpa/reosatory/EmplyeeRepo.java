package com.example.jpa.reosatory;

import com.example.jpa.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmplyeeRepo extends CrudRepository<Employee,Integer> {

}
