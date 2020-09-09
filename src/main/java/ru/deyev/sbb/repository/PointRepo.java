package ru.deyev.sbb.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.deyev.sbb.entity.Point;

@Repository
public class PointRepo extends BasicRepository<Point> {

    protected PointRepo() {
        super(Point.class);
    }
    //todo implement all methods

}
