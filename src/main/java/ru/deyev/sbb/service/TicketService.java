package ru.deyev.sbb.service;

import ru.deyev.sbb.entity.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> getAllTickets();
}
