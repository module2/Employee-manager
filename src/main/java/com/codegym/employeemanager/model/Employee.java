package com.codegym.employeemanager.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.xml.ws.soap.Addressing;
import java.util.Date;

@Entity
@Table(name = "employee")
@Validated
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank(message = "name is not blank")
    private String name;

    private String gender;

    @NotNull(message = "day of birth is not blank")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date day_of_birth;

    @Pattern(regexp = "[0-9]{10}", message = "Phone number have 10 numbers")
    private String phone_number;

    @NotBlank(message = "idcard is not blank")
    private String idcard;

    @NotBlank(message = "email is not blank")
    @Email(message = "email example: abc@gmail.com")
    private String email;

    @NotBlank(message = "address is not blank")
    private String address;

    @ManyToOne(targetEntity = GroupEmployee.class)
    @JoinColumn(name = "group_id")
    private GroupEmployee groupEmployee;

    public Employee() {
    }

    public GroupEmployee getGroupEmployee() {
        return groupEmployee;
    }

    public void setGroupEmployee(GroupEmployee groupEmployee) {
        this.groupEmployee = groupEmployee;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDay_of_birth() {
        return day_of_birth;
    }

    public void setDay_of_birth(Date day_of_birth) {
        this.day_of_birth = day_of_birth;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
