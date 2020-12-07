insert into airCrafts (airline, model, capacity)
values ('S7 Airlines', 'Boeing 737-800', 120),
       ('S7 Airlines', 'Boeing 737-800', 120),
       ('S7 Airlines', 'Boeing 737-800', 120),
       ('S7 Airlines', 'Boeing 737-800', 120),
       ('S7 Airlines', 'Boeing 747-300', 400),
       ('S7 Airlines', 'Boeing 747-300', 400),
       ('S7 Airlines', 'Boeing 747-300', 400),
       ('S7 Airlines', 'Boeing 747-300', 400),
       ('S7 Airlines', 'Boeing 747-300', 400),
       ('Aeroflot', 'Boeing 747-300', 400),
       ('Aeroflot', 'Boeing 747-300', 400),
       ('Aeroflot', 'Boeing 747-300', 400),
       ('Aeroflot', 'Boeing 747-300', 400),
       ('Aeroflot', 'Boeing 737-800', 400),
       ('Aeroflot', 'Boeing 737-800', 400),
       ('Aeroflot', 'Boeing 737-800', 400),
       ('Aeroflot', 'Boeing 737-800', 400),
       ('Aeroflot', 'Boeing 737-800', 400)
;

insert into flights
(aircraft_id, source_city, destination_city, departure_time, arrival_time, journey_duration, price)
values (1, 'KAZAN', 'MOSCOW', 1607990400000, 1500000, 100000, 30000),
       (2, 'KAZAN', 'MOSCOW', 1607990400000, 1500000, 10000, 5000),
       (2, 'KAZAN', 'MOSCOW', 1607990400000, 1500000, 50000, 1000),
       (2, 'MILAN', 'PARIS', 1607990400000, 1500000, 50000, 1000),
       (5, 'LOS-ANGELES', 'PARIS', 1607990400000, 1500000, 50000, 1000)
;