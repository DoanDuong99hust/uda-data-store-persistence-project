package com.project.udadatastorepersistence.service;

import com.project.udadatastorepersistence.schedule.ScheduleDTO;

import java.util.List;

public interface ScheduleService {

    ScheduleDTO create(ScheduleDTO scheduleDTO);
    List<ScheduleDTO> getAll();
    List<ScheduleDTO> getAllByPetId(Long petId);
    List<ScheduleDTO> getAllByEmployeeId(Long employeeId);
    List<ScheduleDTO> getAllByCustomerId(Long customerId);
}
