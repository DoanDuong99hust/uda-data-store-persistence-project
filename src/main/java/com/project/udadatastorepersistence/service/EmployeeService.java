package com.project.udadatastorepersistence.service;

import com.project.udadatastorepersistence.user.EmployeeDTO;
import com.project.udadatastorepersistence.user.EmployeeRequestDTO;

import java.time.DayOfWeek;
import java.util.List;
import java.util.Set;

public interface EmployeeService {

    EmployeeDTO save(EmployeeDTO employeeDTO);
    EmployeeDTO getById(Long employeeId);
    void setAvailability(Set<DayOfWeek> dayOfWeeks, Long employeeId);
    List<EmployeeDTO> findEmployeesForService(EmployeeRequestDTO requestDTO);
}
