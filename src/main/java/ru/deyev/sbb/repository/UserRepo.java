package ru.deyev.sbb.repository;

import org.springframework.stereotype.Repository;
import ru.deyev.sbb.entity.User;

@Repository
public class UserRepo extends BasicRepository<User>{

    protected UserRepo() {
        super(User.class);
    }


}
