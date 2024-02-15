package com.cms.employeemanagement.controller;

import com.cms.employeemanagement.model.Employee;
import com.cms.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import com.cms.employeemanagement.security.SecurityTokenGenerator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@CrossOrigin("*")
@RestController
@RequestMapping("/app")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @Autowired
    private SecurityTokenGenerator securityTokenGenerator;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    @GetMapping("/emp/get")
    public ResponseEntity<?> getAllEmployees(){
        return new ResponseEntity<>(employeeService.getAllEmployees(),HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.registerEmployee(employee),HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginCheck(@RequestBody Employee employee) {
        Employee result = employeeService.login(employee);
        if (result != null) {
            Map<String, String> key = securityTokenGenerator.generateToken(result);
            return new ResponseEntity<>(key,HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Authentication failed", HttpStatus.NOT_FOUND);
        }
    }


}
