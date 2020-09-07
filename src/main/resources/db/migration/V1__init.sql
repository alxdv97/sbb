create table passengers
(
    id uuid not null,
    primary key (id),
    name varchar(50) not null,
    surname varchar(50) not null,
    birth_date timestamp not null

);

create table routes
(
    id uuid not null,
    primary key (id),
    name varchar(100) not null
);

create table trains
(
    id uuid not null,
    primary key (id),
    number int unique not null,
    route_id uuid not null,
    foreign key (route_id) references routes(id),
    capacity int not null
);

create table stations
(
    id uuid not null,
    primary key (id),
    name varchar(100) not null
);

create table points
(
    id uuid not null,
    primary key (id),
    station_id uuid not null,
    foreign key (station_id) references stations(id),
    arrive_time timestamp not null,
    departure_time timestamp not null,
    sequential_route_number int not null,
    route_id uuid not null,
    foreign key (route_id) references routes(id)
);

create table tickets
(
    id uuid not null,
    primary key (id),
    train_id uuid not null,
    foreign key (train_id) references trains(id),
    passenger_id uuid not null,
    foreign key (passenger_id) references passengers(id),
    arrive_point_id uuid not null,
    foreign key (arrive_point_id) references points(id),
    departure_point_id uuid not null,
    foreign key (departure_point_id) references points(id)
);

create table roles
(
    id uuid not null,
    primary key (id),
    name varchar(100) not null
);

create table users
(
    id uuid not null,
    primary key (id),
    email varchar(100) unique not null,
    password varchar(100) not null,
    role_id uuid not null,
    foreign key (role_id) references roles(id)
);

