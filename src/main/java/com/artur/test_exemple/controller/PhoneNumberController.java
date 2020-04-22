package com.artur.test_exemple.controller;

import com.artur.test_exemple.entity.PhoneNumber;
import com.artur.test_exemple.service.PhoneNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneNumberController {

    private final PhoneNumberService phoneNumberService;

    @Autowired
    public PhoneNumberController(PhoneNumberService phoneNumberService) {
        this.phoneNumberService = phoneNumberService;
    }

    @PostMapping(value = "/phone_numbers")
    public ResponseEntity<?> create(@RequestBody PhoneNumber phoneNumber){
        phoneNumberService.create(phoneNumber);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
