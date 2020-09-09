package ru.deyev.sbb.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.deyev.sbb.entity.Train;

@Repository
public class TrainRepo extends BasicRepository<Train> {

    protected TrainRepo() {
        super(Train.class);
    }
    //todo implement all methods

}
