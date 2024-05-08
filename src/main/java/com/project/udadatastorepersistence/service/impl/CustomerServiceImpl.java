package com.project.udadatastorepersistence.service.impl;

import com.project.udadatastorepersistence.service.CustomerService;
import com.project.udadatastorepersistence.user.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO save(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public List<CustomerDTO> getAll() {
        return null;
    }

    @Override
    public CustomerDTO getByPetId(Long petId) {
        return null;
    }
}
