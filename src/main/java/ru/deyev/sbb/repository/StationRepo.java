package ru.deyev.sbb.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.deyev.sbb.entity.Station;

@Repository
public class StationRepo extends BasicRepository<Station> {

    protected StationRepo() {
        super(Station.class);
    }
    //todo implement all methods

}
