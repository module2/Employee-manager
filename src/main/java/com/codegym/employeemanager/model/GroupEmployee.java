package com.codegym.employeemanager.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee_group")
public class GroupEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    @OneToMany(targetEntity = Employee.class)
    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public GroupEmployee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupEmployee(String name) {
        this.name = name;
    }
}
