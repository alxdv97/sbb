package ru.deyev.sbb.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.deyev.sbb.entity.Route;

@Repository
public class RouteRepo extends BasicRepository<Route> {
    protected RouteRepo() {
        super(Route.class);
    }
    //todo implement all methods

}
