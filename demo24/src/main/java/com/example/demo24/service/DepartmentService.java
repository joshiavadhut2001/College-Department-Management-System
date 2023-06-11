package com.example.demo24.service;

import com.example.demo24.entity.Department;
import com.example.demo24.error.DepartmentNotFoundException;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

   public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

   public Optional<Department> fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

   public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

     Department fetchDepartmentByName(String departmentName);
}
