package ru.deyev.sbb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.deyev.sbb.entity.Train;


import ru.deyev.sbb.repository.RouteRepo;
import ru.deyev.sbb.repository.TrainRepo;
import ru.deyev.sbb.service.TrainService;

import java.util.List;

@Service
public class TrainServiceImpl implements TrainService {

    @Autowired
    private TrainRepo trainRepo;

    @Autowired
    private RouteRepo routeRepo;


    @Override
    @Transactional
    public List<Train> getAllTrains() {
        return trainRepo.findAll();
    }
}
