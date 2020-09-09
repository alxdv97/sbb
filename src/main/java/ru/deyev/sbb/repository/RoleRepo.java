package ru.deyev.sbb.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.deyev.sbb.entity.Role;

@Repository
public class RoleRepo extends BasicRepository<Role> {

    protected RoleRepo() {
        super(Role.class);
    }
    //todo implement all methods

}
