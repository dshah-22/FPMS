package com.fpms.login.services;

import com.fpms.login.dao.UserRepo;
import com.fpms.login.entities.Login;
import com.fpms.login.entities.User;
import com.fpms.login.payload.response.LoginMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
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
        this.passwordEncoder.encode(user.getPassword());
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
    @Override
    public LoginMessage loginEmployee(Login login) {
        String msg = "";
        User user1 = userRepo.findByEmailId(login.getEmailId());
        if(user1 != null){
            String password = login.getPassword();
            String encodedPassword = user1.getPassword();
            if(password.equals(encodedPassword)) {
                Optional<User> user = userRepo.findOneByEmailIdAndPassword(login.getEmailId(), encodedPassword);
                if (user.isPresent()) {
                    return new LoginMessage("Login Successful", true);
                } else {
                    return new LoginMessage("Login Fail", false);
                }
            }else {
                return new LoginMessage("Password not Match",false);
            }
        }else{
            return new LoginMessage("Email does not exists",false);
        }
    }
}