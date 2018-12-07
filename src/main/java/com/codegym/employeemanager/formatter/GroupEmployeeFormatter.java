package com.codegym.employeemanager.formatter;

import com.codegym.employeemanager.model.GroupEmployee;
import com.codegym.employeemanager.service.GroupEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;
import java.util.Optional;

public class GroupEmployeeFormatter implements Formatter<Optional<GroupEmployee>> {

    private GroupEmployeeService groupEmployeeService;

    @Autowired
    public GroupEmployeeFormatter(GroupEmployeeService e) {
        this.groupEmployeeService = e;
    }

    @Override
    public Optional<GroupEmployee> parse(String text, Locale locale) throws ParseException {
        return groupEmployeeService.findById(Integer.parseInt(text));
    }

    @Override
    public String print(Optional<GroupEmployee> object, Locale locale) {
        return "[" + object.get().getId() + ", " + object.get().getName() + "]";
    }
}
