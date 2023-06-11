package com.example.demo24.service;

import com.example.demo24.entity.Department;
import com.example.demo24.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentServiceTest {

    @MockBean
    private DepartmentRepository departmentRepository;
    @Autowired
    private DepartmentService departmentService;
    @BeforeEach
    void setUp() {
        Department department=Department.builder()
                .DepartmentName("Comp")
                .DepartmentId(1L)
                .DepartmentAddress("Pune")
                .DepartmentCode("Com-06")
                .build();

        Mockito.when(departmentRepository.findByDepartmentName("Comp")).thenReturn(department);
    }

    @Test
    @DisplayName("Get Data Based on valid Department Name")
    public void whenValidDepartmentName_ThenDeparmentshouldFound(){

        String departmentName="comp";
        Department found = departmentService.fetchDepartmentByName(departmentName);
        assertEquals(found.getDepartmentName(),departmentName);
    }
}