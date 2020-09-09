package ru.deyev.sbb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.deyev.sbb.entity.User;
import ru.deyev.sbb.repository.UserRepo;
import ru.deyev.sbb.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
