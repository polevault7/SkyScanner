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
values (1, 'KAZAN', 'MOSCOW', 1608163200000, 1500000, 100000, 30000),
       (2, 'KAZAN', 'MOSCOW', 1608163200000, 1500000, 10000, 5000),
       (2, 'KAZAN', 'MOSCOW', 1608163200000, 1500000, 50000, 1000),
       (2, 'MILAN', 'PARIS', 1608163200000, 1500000, 50000, 1000),
       (5, 'TOKYO', 'MELBOURNE', 1608422400000, 1500000, 50000, 1000),
       (3, 'TOKYO', 'VANCOUVER', 1608422400000, 1500000, 50000, 1000),
       (15, 'OSAKA', 'QUEBEC', 1608422400000, 1500000, 50000, 1000),
       (10, 'BRISBANE', 'CHICAGO', 1608422400000, 1500000, 50000, 1000),
       (2, 'MOSCOW', 'KAZAN', 1608854400000, 1500000, 50000, 1000),
       (4, 'MOSCOW', 'KAZAN', 1608854400000, 1500000, 50000, 1000)
;

insert into tickets (flight_id, passenger_name)
values (1, 'SERGEY'),
       (1, 'VITALY'),
       (1, 'ANDREY'),
       (1, 'SASHA'),
       (1, 'GRIGORY')
;