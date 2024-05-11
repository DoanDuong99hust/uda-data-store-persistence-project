package com.project.udadatastorepersistence.mapper;

import com.project.udadatastorepersistence.entity.Customer;
import com.project.udadatastorepersistence.pet.PetDTO;
import com.project.udadatastorepersistence.service.PetService;
import com.project.udadatastorepersistence.user.CustomerDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class CustomerMapper {

    private final PetService petService;

    public Customer toEntity(CustomerDTO customerDTO) {
        Customer customer = new Customer();

        customer.setName(customerDTO.getName());
        customer.setNotes(customerDTO.getNotes());
        customer.setPhoneNumber(customerDTO.getPhoneNumber());

        return customer;
    }

    public CustomerDTO toDto(Customer customer) {
        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setId(customer.getId());
        customerDTO.setName(customer.getName());
        customerDTO.setNotes(customer.getNotes());
        customerDTO.setPhoneNumber(customerDTO.getPhoneNumber());

        List<PetDTO> pets = petService.getAllByCustomerId(customer.getId());
        List<Long> petId = pets.stream().map(PetDTO::getId).toList();
        customerDTO.setPetIds(petId);

        return customerDTO;
    }
}
