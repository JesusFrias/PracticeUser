package com.example.service;

import com.example.model.User;

public interface IUserService {
    User saveUser(User user);
    void deleteUser(Long idUser);
    User searchUser(Long idUser);
}
