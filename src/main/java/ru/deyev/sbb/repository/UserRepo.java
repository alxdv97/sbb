package ru.deyev.sbb.repository;

import ru.deyev.sbb.entity.User;

import java.util.List;

public interface UserRepo {
    List<User> findAll();
}
