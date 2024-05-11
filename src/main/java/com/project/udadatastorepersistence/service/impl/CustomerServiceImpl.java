package com.project.udadatastorepersistence.service.impl;

import com.project.udadatastorepersistence.entity.Pet;
import com.project.udadatastorepersistence.mapper.CustomerMapper;
import com.project.udadatastorepersistence.repository.CustomerRepository;
import com.project.udadatastorepersistence.repository.PetRepository;
import com.project.udadatastorepersistence.service.CustomerService;
import com.project.udadatastorepersistence.user.CustomerDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;
    private final PetRepository petRepository;

    @Override
    public CustomerDTO save(CustomerDTO customerDTO) {
        return customerMapper.toDto(customerRepository.save(customerMapper.toEntity(customerDTO)));
    }

    @Override
    public List<CustomerDTO> getAll() {
        return customerRepository.findAll().stream().map(customerMapper::toDto).toList();
    }

    @Override
    public CustomerDTO getByPetId(Long petId) {
        Pet pet = petRepository.getReferenceById(petId);
        return customerMapper.toDto(customerRepository.getReferenceById(pet.getCustomer().getId()));
    }
}
