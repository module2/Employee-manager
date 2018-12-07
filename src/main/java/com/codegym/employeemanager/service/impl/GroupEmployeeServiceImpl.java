package com.codegym.employeemanager.service.impl;

import com.codegym.employeemanager.model.GroupEmployee;
import com.codegym.employeemanager.repository.GroupEmployeeRepository;
import com.codegym.employeemanager.service.GroupEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class GroupEmployeeServiceImpl implements GroupEmployeeService {
    @Autowired
    private GroupEmployeeRepository groupEmployeeRepository;
    @Override
    public Iterable<GroupEmployee> findAll() {
        return groupEmployeeRepository.findAll();
    }

    @Override
    public Optional<GroupEmployee> findById(Integer id) {
        return groupEmployeeRepository.findById(id);
    }
}
