package ru.deyev.sbb.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.deyev.sbb.entity.Ticket;

@Repository
public class TicketRepo extends BasicRepository<Ticket> {

    protected TicketRepo() {
        super(Ticket.class);
    }
    //todo implement all methods

}
