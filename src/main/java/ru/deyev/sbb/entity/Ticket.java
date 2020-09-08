package ru.deyev.sbb.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "tickets")
@Data
public class Ticket {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "ticket_id", updatable = false, nullable = false, columnDefinition = "UUID")
    private UUID id;

    @Column(name = "train_id")
    private UUID trainId;

    @Column(name = "passenger_id")
    private UUID passengerId;

    @Column(name = "arrive_point_id")
    private UUID arrivePointId;

    @Column(name = "departure_point_id")
    private UUID departurePointId;
}
