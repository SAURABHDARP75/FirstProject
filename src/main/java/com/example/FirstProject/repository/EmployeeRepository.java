package com.example.FirstProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FirstProject.model.Employee;

@Repository
interface EmployeeRepository extends JpaRepository<Employee, String> {

}
