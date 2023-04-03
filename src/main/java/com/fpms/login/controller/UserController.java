package com.fpms.login.controller;

import com.fpms.login.entities.Login;
import com.fpms.login.entities.User;
import com.fpms.login.payload.response.LoginMessage;
import com.fpms.login.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/home")
    public String home(){
        return "Welcome to home";
    }

    @GetMapping("/users")
    public List<User> getUsers(){
         return this.userService.getUsers();
    }

    @GetMapping("/users/{email}")
    public User getUser(@PathVariable String email){
        return this.userService.getUser(email);
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return this.userService.addUser(user);
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        return this.userService.updateUser(user);
    }

    @DeleteMapping("/users/{email}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable String email){
        try{
            this.userService.deleteUser(email);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginEmployee(@RequestBody Login login){
        LoginMessage loginMessage = userService.loginEmployee(login);
        return ResponseEntity.ok(loginMessage);
    }
}
