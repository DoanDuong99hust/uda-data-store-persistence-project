package com.project.udadatastorepersistence.service.impl;

import com.project.udadatastorepersistence.service.EmployeeService;
import com.project.udadatastorepersistence.user.EmployeeDTO;
import com.project.udadatastorepersistence.user.EmployeeRequestDTO;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.util.List;
import java.util.Set;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public EmployeeDTO save(EmployeeDTO employeeDTO) {
        return null;
    }

    @Override
    public EmployeeDTO getById(Long employeeId) {
        return null;
    }

    @Override
    public void setAvailability(Set<DayOfWeek> dayOfWeeks, Long employeeId) {

    }

    @Override
    public List<EmployeeDTO> findEmployeesForService(EmployeeRequestDTO requestDTO) {
        return null;
    }
}
