create table airCrafts
(
    id       integer primary key auto_increment,
    airline  varchar(255) not null,
    model    varchar(255) not null,
    capacity integer      not null
);

create table flights
(
    id               integer primary key auto_increment,
    aircraft_id      integer      not null,
    foreign key (aircraft_id) references airCrafts,
    source_city      varchar(255) not null,
    destination_city varchar(255) not null,
    departure_time   BIGINT      not null,
    arrival_time     BIGINT      not null,
    journey_duration BIGINT      not null,
    price            integer      not null
);

--create table tickets
--(
--  id          integer primary key auto_increment,
--person_name varchar(255)    not null,
--flight_id   integer not null,
--foreign key (flight_id) references flights
--);
