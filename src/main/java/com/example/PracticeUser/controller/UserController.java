package com.example.PracticeUser.controller;

import com.example.PracticeUser.model.User;
import com.example.PracticeUser.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("/save")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User userObj = userService.saveUser(user);
        return new ResponseEntity<>(userObj, HttpStatus.OK);
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        Optional<User> userData = Optional.ofNullable(userService.searchUser(id));
        if(userData.isPresent()) {
            return new ResponseEntity<>(userData.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteUserById(@PathVariable Long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
