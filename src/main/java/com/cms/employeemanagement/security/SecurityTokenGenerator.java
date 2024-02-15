package com.cms.employeemanagement.security;

import com.cms.employeemanagement.model.Employee;

import java.util.Map;

public interface SecurityTokenGenerator {
    public Map<String,String> generateToken(Employee employee);
}
