package com.artur.test_exemple.service;

import com.artur.test_exemple.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsersByPhoneNumbers();

    void create(User user);

    boolean delete(Long id);
}
