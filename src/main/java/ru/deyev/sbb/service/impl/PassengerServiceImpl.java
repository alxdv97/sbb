package ru.deyev.sbb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.deyev.sbb.entity.Passenger;
import ru.deyev.sbb.repository.PassengerRepo;
import ru.deyev.sbb.service.PassengerService;

import java.util.List;

@Service
public class PassengerServiceImpl implements PassengerService {

    @Autowired
    private PassengerRepo passengerRepo;

    @Override
    @Transactional
    public List<Passenger> getAllPassengers() {
        return passengerRepo.findAll();
    }
}
