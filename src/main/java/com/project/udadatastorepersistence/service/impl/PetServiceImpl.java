package com.project.udadatastorepersistence.service.impl;

import com.project.udadatastorepersistence.entity.Pet;
import com.project.udadatastorepersistence.pet.PetDTO;
import com.project.udadatastorepersistence.service.PetService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceImpl implements PetService {
    @Override
    public PetDTO save(PetDTO petDTO) {
        return null;
    }

    @Override
    public PetDTO getById(Long petId) {
        return null;
    }

    @Override
    public List<PetDTO> getAll() {
        return null;
    }

    @Override
    public List<PetDTO> getAllByCustomerId(Long customerId) {
        return null;
    }
}
