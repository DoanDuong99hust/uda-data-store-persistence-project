package com.project.udadatastorepersistence.repository;

import com.project.udadatastorepersistence.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> findAllByPetsIn(Set<Long> petIds);
    List<Schedule> findAllByEmployeesIn(Set<Long> employeeId);
}
