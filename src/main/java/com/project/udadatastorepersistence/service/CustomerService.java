package com.project.udadatastorepersistence.service;

import com.project.udadatastorepersistence.user.CustomerDTO;

import java.util.List;

public interface CustomerService {

    CustomerDTO save(CustomerDTO customerDTO);
    List<CustomerDTO> getAll();
    CustomerDTO getByPetId(Long petId);

}
