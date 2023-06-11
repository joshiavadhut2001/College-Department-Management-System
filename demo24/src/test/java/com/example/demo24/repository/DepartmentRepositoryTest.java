package com.example.demo24.repository;

import com.example.demo24.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private TestEntityManager testEntityManager;
    @BeforeEach
    void setUp() {

        Department department = Department.builder()
                .DepartmentId(1L)
                .DepartmentCode("comp-06")
                .DepartmentAddress("Pune")
                .DepartmentName("Comp")
                .build();

        testEntityManager.persist(department);


    }
    @Test
    public void whenFindById_thenReturnDepartment(){
//        Department department = DepartmentRepository.findById().get();
//        assertEquals(department.getDepartmentName(),"Comp");
    }

}