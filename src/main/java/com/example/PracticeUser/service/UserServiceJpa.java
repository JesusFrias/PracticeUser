package com.example.PracticeUser.service;

import com.example.PracticeUser.model.User;
import com.example.PracticeUser.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class UserServiceJpa implements IUserService{
    @Autowired
    UserRepository userRepo;
    @Override
    public User saveUser(User user) {
        userRepo.save(user);
        return user;
    }

    @Override
    public void deleteUser(Long idUser) {
        userRepo.deleteById(idUser);
    }

    @Override
    public User searchUser(Long idUser) {
        Optional<User> optional = userRepo.findById(idUser);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }
}
