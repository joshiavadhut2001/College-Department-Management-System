package com.example.demo24.controller;

import com.example.demo24.entity.Department;
import com.example.demo24.error.DepartmentNotFoundException;
import com.example.demo24.repository.DepartmentRepository;
import com.example.demo24.service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {
    @MockBean
    private DepartmentService departmentService;

    private Department department;


    @BeforeEach
    void setUp() {
         department = department.builder()
                 .DepartmentId(1L)
                 .DepartmentName("Comp")
                 .DepartmentAddress("Pune")
                 .DepartmentCode("comp-06")
                 .build();

    }

    @Test
    void saveDepartment() {
      Department  inputdepartment = department.builder()
                .DepartmentName("Comp")
                .DepartmentAddress("Pune")
                .DepartmentCode("comp-06")
                .build();

        Mockito.when(departmentService.saveDepartment(inputdepartment))
                        .thenReturn(department);

//        MockMvc.perform(post("/departments")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("{\n" +
//                        "    \"DepartmentName\":\"comp\",\n" +
//                        "    \"DepartmentAddress\":\"Pune\",\n" +
//                        "    \"DepartmentCode\":\"comp-06\"\n" +
//                        "}"))
//                .andExpect(status().isOk());
    }

    @Test
    void fetchDepartmentById() throws DepartmentNotFoundException {
        Mockito.when(departmentService.fetchDepartmentById(1L)
        ).thenReturn(Optional.ofNullable(department));
    }
}