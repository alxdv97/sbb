package ru.deyev.sbb.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "trains")
public class Train {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "train_id", updatable = false, nullable = false, columnDefinition = "UUID")
    private UUID id;


    @Column(name = "route_id")
    private UUID routeId;

    @Column(name = "number", nullable = false)
    private int number;

    @Column(name = "capacity", nullable = false)
    private int capacity;
}
