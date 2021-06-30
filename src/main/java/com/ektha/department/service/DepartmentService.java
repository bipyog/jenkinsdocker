package com.ektha.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.department.entity.Department;
import com.ektha.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {

        log.info("Inside save of service");
        return departmentRepository.save(department);
    }

    public Department findByDepartmentId(Long departmentId) {
        log.info("Inside service class findDepartmentById method");
         return departmentRepository.findByDepartmentId(departmentId);
    }

}

