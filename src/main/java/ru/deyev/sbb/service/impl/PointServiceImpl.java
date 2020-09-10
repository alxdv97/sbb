package ru.deyev.sbb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.deyev.sbb.entity.Point;
import ru.deyev.sbb.repository.PointRepo;
import ru.deyev.sbb.repository.RouteRepo;
import ru.deyev.sbb.repository.StationRepo;
import ru.deyev.sbb.service.PointService;

import java.util.List;

@Service
public class PointServiceImpl implements PointService {

    @Autowired
    private PointRepo pointRepo;

    @Autowired
    private StationRepo stationRepo;

    @Autowired
    private RouteRepo routeRepo;

    @Override
    @Transactional
    public List<Point> getAllPoints() {
        return null;
    }
}
