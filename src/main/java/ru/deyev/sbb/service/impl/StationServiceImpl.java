package ru.deyev.sbb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.deyev.sbb.entity.Station;
import ru.deyev.sbb.repository.StationRepo;
import ru.deyev.sbb.service.StationService;

import java.util.List;

@Service
public class StationServiceImpl implements StationService {

    @Autowired
    private StationRepo stationRepo;

    @Override
    public List<Station> getAllStations() {
        return stationRepo.findAll();
    }
}
