package com.project.udadatastorepersistence.service.impl;

import com.project.udadatastorepersistence.mapper.PetMapper;
import com.project.udadatastorepersistence.pet.PetDTO;
import com.project.udadatastorepersistence.repository.PetRepository;
import com.project.udadatastorepersistence.service.PetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PetServiceImpl implements PetService {

    private final PetRepository petRepository;
    private final PetMapper petMapper;

    @Override
    public PetDTO save(PetDTO petDTO) {
        return petMapper.toDto(petRepository.save(petMapper.toEntity(petDTO)));
    }

    @Override
    public PetDTO getById(Long petId) {
        return petMapper.toDto(petRepository.getReferenceById(petId));
    }

    @Override
    public List<PetDTO> getAll() {
        return petRepository.findAll().stream().map(petMapper::toDto).toList();
    }

    @Override
    public List<PetDTO> getAllByCustomerId(Long customerId) {
        return petRepository.findAllByCustomer_Id(customerId).stream().map(petMapper::toDto).toList();
    }
}
