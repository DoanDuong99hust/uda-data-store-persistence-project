package com.project.udadatastorepersistence.service.impl;

import com.project.udadatastorepersistence.entity.Employee;
import com.project.udadatastorepersistence.mapper.EmployeeMapper;
import com.project.udadatastorepersistence.repository.EmployeeRepository;
import com.project.udadatastorepersistence.service.EmployeeService;
import com.project.udadatastorepersistence.user.EmployeeDTO;
import com.project.udadatastorepersistence.user.EmployeeRequestDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.DayOfWeek;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Override
    public EmployeeDTO save(EmployeeDTO employeeDTO) {
        return employeeMapper.toDto(employeeRepository.save(employeeMapper.toEntity(employeeDTO)));
    }

    @Override
    public EmployeeDTO getById(Long employeeId) {
        return employeeMapper.toDto(employeeRepository.getReferenceById(employeeId));
    }

    @Override
    @Transactional
    public void setAvailability(Set<DayOfWeek> dayOfWeeks, Long employeeId) {
        Employee employee = employeeRepository.getReferenceById(employeeId);
        employee.setDaysAvailable(dayOfWeeks);
    }

    @Override
    public List<EmployeeDTO> findEmployeesForService(EmployeeRequestDTO requestDTO) {
        return employeeRepository.findAll().stream()
                .filter(emp -> emp.getSkills().containsAll(requestDTO.getSkills()) && emp.getDaysAvailable().contains(requestDTO.getDate().getDayOfWeek()))
                .map(employeeMapper::toDto)
                .toList();
    }
}
