package com.morrisje.mssbrewery.services;

import com.morrisje.mssbrewery.web_models.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("James").build();
    }
}
