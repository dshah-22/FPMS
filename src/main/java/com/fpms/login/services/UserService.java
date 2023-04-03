package com.fpms.login.services;

import com.fpms.login.entities.Login;
import com.fpms.login.entities.User;
import com.fpms.login.payload.response.LoginMessage;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUser(String email);
    User addUser(User user);
    User updateUser(User user);
    void deleteUser(String email);

    LoginMessage loginEmployee(Login login);
}
