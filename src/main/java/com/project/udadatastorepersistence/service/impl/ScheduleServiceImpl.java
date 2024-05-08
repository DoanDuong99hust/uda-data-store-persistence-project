package com.project.udadatastorepersistence.service.impl;

import com.project.udadatastorepersistence.schedule.ScheduleDTO;
import com.project.udadatastorepersistence.service.ScheduleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Override
    public ScheduleDTO create(ScheduleDTO scheduleDTO) {
        return null;
    }

    @Override
    public List<ScheduleDTO> getAll() {
        return null;
    }

    @Override
    public List<ScheduleDTO> getAllByPetId(Long petId) {
        return null;
    }

    @Override
    public List<ScheduleDTO> getAllByEmployeeId(Long employeeId) {
        return null;
    }

    @Override
    public List<ScheduleDTO> getAllByCustomerId(Long customerId) {
        return null;
    }
}
