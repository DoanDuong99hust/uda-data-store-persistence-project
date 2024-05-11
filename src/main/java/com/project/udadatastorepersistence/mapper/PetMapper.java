package com.project.udadatastorepersistence.mapper;

import com.project.udadatastorepersistence.entity.Customer;
import com.project.udadatastorepersistence.entity.Pet;
import com.project.udadatastorepersistence.pet.PetDTO;
import com.project.udadatastorepersistence.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PetMapper {

    private final CustomerRepository customerRepository;

    public PetDTO toDto(Pet pet) {
        PetDTO petDTO = new PetDTO();

        petDTO.setId(pet.getId());
        petDTO.setName(pet.getName());
        petDTO.setType(pet.getType());
        petDTO.setNotes(pet.getNotes());
        petDTO.setBirthDate(pet.getBirthDate());
        petDTO.setOwnerId(pet.getCustomer().getId());

        return petDTO;
    }

    public Pet toEntity(PetDTO dto) {
        Pet pet = new Pet();

        pet.setName(dto.getName());
        pet.setType(dto.getType());
        pet.setNotes(dto.getNotes());
        pet.setBirthDate(dto.getBirthDate());

        Customer customer = customerRepository.getReferenceById(dto.getOwnerId());
        pet.setCustomer(customer);

        return pet;
    }
}
