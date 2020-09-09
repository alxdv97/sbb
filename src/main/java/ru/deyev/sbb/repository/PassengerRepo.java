package ru.deyev.sbb.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.deyev.sbb.entity.Passenger;

@Repository
public class PassengerRepo extends BasicRepository<Passenger> {

    protected PassengerRepo() {
        super(Passenger.class);
    }
    //todo implement all methods
}
