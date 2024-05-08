package com.project.udadatastorepersistence.service;

import com.project.udadatastorepersistence.entity.Pet;
import com.project.udadatastorepersistence.pet.PetDTO;

import java.util.List;

public interface PetService {

    PetDTO save(PetDTO petDTO);
    PetDTO getById(Long petId);
    List<PetDTO> getAll();
    List<PetDTO> getAllByCustomerId(Long customerId);
}
