package com.project.udadatastorepersistence.mapper;

import com.project.udadatastorepersistence.entity.Employee;
import com.project.udadatastorepersistence.entity.Pet;
import com.project.udadatastorepersistence.entity.Schedule;
import com.project.udadatastorepersistence.repository.EmployeeRepository;
import com.project.udadatastorepersistence.repository.PetRepository;
import com.project.udadatastorepersistence.schedule.ScheduleDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ScheduleMapper {

    private final PetRepository petRepository;
    private final EmployeeRepository employeeRepository;

    public ScheduleDTO toDto(Schedule schedule) {
        ScheduleDTO dto = new ScheduleDTO();

        dto.setId(schedule.getId());
        dto.setDate(schedule.getDate());
        dto.setActivities(schedule.getActivities());
        dto.setPetIds(schedule.getPets().stream().map(Pet::getId).toList());
        dto.setEmployeeIds(schedule.getEmployees().stream().map(Employee::getId).toList());

        return dto;
    }

    public Schedule toEntity(ScheduleDTO dto) {
        Schedule schedule = new Schedule();

        schedule.setDate(dto.getDate());
        schedule.setActivities(dto.getActivities());

        List<Pet> pets = petRepository.findAllById(dto.getPetIds());
        schedule.setPets(pets);

        List<Employee> employees = employeeRepository.findAllById(dto.getEmployeeIds());
        schedule.setEmployees(employees);

        return schedule;
    }
}
