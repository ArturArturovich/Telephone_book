package com.artur.test_exemple.service.impl;

import com.artur.test_exemple.entity.PhoneNumber;
import com.artur.test_exemple.repository.PhoneNumberRepository;
import com.artur.test_exemple.service.PhoneNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneNumberServiceImpl implements PhoneNumberService {

    private final PhoneNumberRepository phoneNumberRepository;

    @Autowired
    public PhoneNumberServiceImpl(PhoneNumberRepository phoneNumberRepository) {
        this.phoneNumberRepository = phoneNumberRepository;
    }


    @Override
    public void create(PhoneNumber phoneNumber) {
        phoneNumberRepository.save(phoneNumber);
    }
}
