package com.codegym.employeemanager.repository;

import com.codegym.employeemanager.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
    Page<Employee> findAllByNameContaining(Optional<String> s, Pageable pageable);
}
