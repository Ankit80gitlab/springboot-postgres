package com.cms.core.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@Getter
@Setter
@Table(name = "empData")
public class Employee {

    @Id
    @GeneratedValue
    private int id;

    private String firstName;

    private String lastName;

    private String department;

    private String role;

    private String email;

    private String password;

    public Employee() {

    }

    public Employee(int id, String firstName, String lastName, String department, String role, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.role = role;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", role='" + role + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}