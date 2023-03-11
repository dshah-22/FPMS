package com.fpms.login.services;

import com.fpms.login.entities.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUser(String email);
    User addUser(User user);
    User updateUser(User user);
    void deleteUser(String email);
}
