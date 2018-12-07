package com.codegym.employeemanager.repository;

import com.codegym.employeemanager.model.GroupEmployee;
import org.springframework.data.repository.CrudRepository;

public interface GroupEmployeeRepository extends CrudRepository<GroupEmployee, Integer> {
}
