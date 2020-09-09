create extension if not exists "pgcrypto";

create table if not exists passengers
(
    passenger_id uuid primary key not null default gen_random_uuid(),
    name varchar(50) not null,
    surname varchar(50) not null,
    birth_date timestamp not null
);

create table if not exists routes
(
    route_id uuid primary key not null default gen_random_uuid(),
    name varchar(100) not null
);

create table if not exists trains
(
    train_id uuid primary key not null default gen_random_uuid(),
    number int unique not null,
    route_id uuid not null,
        foreign key (route_id) references routes(route_id),
    capacity int not null
);

create table if not exists stations
(
    station_id uuid primary key not null default gen_random_uuid(),
    name varchar(100) not null
);

create table if not exists points
(
    point_id uuid primary key not null default gen_random_uuid(),
    station_id uuid not null,
        foreign key (station_id) references stations(station_id),
    arrive_time timestamp not null,
    departure_time timestamp not null,
    sequential_route_number int not null,
    route_id uuid not null,
        foreign key (route_id) references routes(route_id)
);

create table if not exists tickets
(
    ticket_id uuid primary key not null default gen_random_uuid(),
    train_id uuid not null,
        foreign key (train_id) references trains(train_id),
    passenger_id uuid not null,
        foreign key (passenger_id) references passengers(passenger_id),
    arrive_point_id uuid not null,
        foreign key (arrive_point_id) references points(point_id),
    departure_point_id uuid not null,
        foreign key (departure_point_id) references points(point_id)
);

create table if not exists roles
(
    role_id uuid primary key not null default gen_random_uuid(),
    name varchar(100) not null
);

create table if not exists users
(
    user_id uuid primary key not null default gen_random_uuid(),
    email varchar(100) unique not null,
    password varchar(100) not null,
    role_id uuid not null,
        foreign key (role_id) references roles(role_id)
);

