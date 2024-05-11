package com.project.udadatastorepersistence.repository;

import com.project.udadatastorepersistence.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

    List<Pet> findAllByCustomer_Id(Long customerId);
}
