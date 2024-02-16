package com.cms.employeemanagement.service;

import com.cms.employeemanagement.model.Employee;
import com.cms.employeemanagement.repository.EmployeeRepositoryDAO;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    EmployeeRepositoryDAO employeeRepository;

    public EmployeeService(EmployeeRepositoryDAO employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees()
    {
        return employeeRepository.findAll();
    }

    public Employee registerEmployee(Employee employee) {
        if(employeeRepository.findById(employee.getId()).isPresent()){
            return null;}
        else{
            employeeRepository.save(employee);
            return employee;}
    }

    public Employee login(Employee employee) {
        Employee emp = new Employee();
//        emp.setEmail(employee.getEmail());
//        emp.setPassword(employee.getPassword());
        boolean verified = false;

        List<Employee> list = employeeRepository.findAll();
        for(Employee e : list){
            if(e.getEmail().equals(employee.getEmail()) && e.getPassword().equals(employee.getPassword())){
                verified = true;
                emp = e;
                break;
            }
        }
        if(verified){
            emp.setPassword("");
            return emp;
        }else{return null;}
    }
}
