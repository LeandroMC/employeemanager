package com.angularspring.emproyeemanager.repository;

import java.util.Optional;

import com.angularspring.emproyeemanager.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
