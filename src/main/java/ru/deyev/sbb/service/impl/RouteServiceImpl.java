package ru.deyev.sbb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.deyev.sbb.entity.Route;
import ru.deyev.sbb.repository.RouteRepo;
import ru.deyev.sbb.service.RouteService;

import java.util.List;

@Service
public class RouteServiceImpl implements RouteService {

    @Autowired
    private RouteRepo routeRepo;

    @Override
    @Transactional
    public List<Route> getAllRoutes() {
        return routeRepo.findAll();
    }
}
