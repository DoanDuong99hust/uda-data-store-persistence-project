package com.project.udadatastorepersistence.service.impl;

import com.project.udadatastorepersistence.entity.Pet;
import com.project.udadatastorepersistence.mapper.ScheduleMapper;
import com.project.udadatastorepersistence.repository.PetRepository;
import com.project.udadatastorepersistence.repository.ScheduleRepository;
import com.project.udadatastorepersistence.schedule.ScheduleDTO;
import com.project.udadatastorepersistence.service.ScheduleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {

     private final ScheduleRepository scheduleRepository;
     private final ScheduleMapper scheduleMapper;
     private final PetRepository petRepository;

    @Override
    public ScheduleDTO create(ScheduleDTO scheduleDTO) {
        return scheduleMapper.toDto(scheduleRepository.save(scheduleMapper.toEntity(scheduleDTO)));
    }

    @Override
    public List<ScheduleDTO> getAll() {
        return scheduleRepository.findAll().stream().map(scheduleMapper::toDto).toList();
    }

    @Override
    public List<ScheduleDTO> getAllByPetId(Long petId) {
        return scheduleRepository.findAllByPetsIn(Set.of(petId)).stream().map(scheduleMapper::toDto).toList();
    }

    @Override
    public List<ScheduleDTO> getAllByEmployeeId(Long employeeId) {
        return scheduleRepository.findAllByEmployeesIn(Set.of(employeeId)).stream().map(scheduleMapper::toDto).toList();
    }

    @Override
    public List<ScheduleDTO> getAllByCustomerId(Long customerId) {
        List<Pet> pets = petRepository.findAllByCustomer_Id(customerId);
        Set<Long> petIds = pets.stream().map(Pet::getId).collect(Collectors.toSet());
        return scheduleRepository.findAllByPetsIn(petIds).stream().map(scheduleMapper::toDto).toList();
    }
}
