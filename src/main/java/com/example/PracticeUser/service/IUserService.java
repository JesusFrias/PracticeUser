package com.example.PracticeUser.service;

import com.example.PracticeUser.model.User;

public interface IUserService {
    User saveUser(User user);
    void deleteUser(Long idUser);
    User searchUser(Long idUser);
}
