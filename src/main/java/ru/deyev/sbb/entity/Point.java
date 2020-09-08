package ru.deyev.sbb.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "points")
public class Point {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "point_id", updatable = false, nullable = false, columnDefinition = "UUID")
    private UUID id;

    @Column(name = "station_id")
    private UUID stationId;

    @Column(name = "arrive_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date arriveTime;

    @Column(name = "departure_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date departureTime;

    @Column(name = "sequential_route_number", nullable = false)
    private int sequentialRouteNumber;

    @Column(name = "route_id")
    private UUID routeId;

}
