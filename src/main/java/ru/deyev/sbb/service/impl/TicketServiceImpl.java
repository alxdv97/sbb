package ru.deyev.sbb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.deyev.sbb.entity.Ticket;
import ru.deyev.sbb.repository.PassengerRepo;
import ru.deyev.sbb.repository.PointRepo;
import ru.deyev.sbb.repository.TicketRepo;
import ru.deyev.sbb.repository.TrainRepo;
import ru.deyev.sbb.service.TicketService;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepo ticketRepo;

    @Autowired
    private TrainRepo trainRepo;

    @Autowired
    private PassengerRepo passengerRepo;

    @Autowired
    private PointRepo pointRepo;

    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepo.findAll();
    }
}
