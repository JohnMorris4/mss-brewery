package com.morrisje.mssbrewery.services;

import com.morrisje.mssbrewery.web_models.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
