package ru.deyev.sbb.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "routes")
public class Route {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "route_id", updatable = false, nullable = false, columnDefinition = "UUID")
    private UUID id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;
}
