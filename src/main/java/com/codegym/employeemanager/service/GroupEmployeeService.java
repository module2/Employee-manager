package com.codegym.employeemanager.service;

import com.codegym.employeemanager.model.GroupEmployee;

import java.util.Optional;

public interface GroupEmployeeService {
    Iterable<GroupEmployee> findAll();

    Optional<GroupEmployee> findById(Integer id);
}
