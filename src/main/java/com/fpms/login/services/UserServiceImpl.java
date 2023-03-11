package com.fpms.login.services;

import com.fpms.login.dao.UserRepo;
import com.fpms.login.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;
    public UserServiceImpl(){}
    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    public User getUser(String email){
        return userRepo.findById(email).get();
    }

    @Override
    public User addUser(User user) {
        userRepo.save(user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        userRepo.save(user);
        return user;
    }

    @Override
    public void deleteUser(String email) {
        User entity = userRepo.getOne(email);
        userRepo.delete(entity);
    }
}
