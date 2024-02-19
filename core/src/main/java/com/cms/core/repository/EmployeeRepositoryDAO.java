package com.cms.core.repository;

import com.cms.core.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositoryDAO extends JpaRepository<Employee, Integer> {
}
