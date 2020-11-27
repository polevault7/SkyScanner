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
values (1, 'KAZAN', 'MOSCOW', 5000,1500000, 1000000 - 5000, 1000),
       (2, 'MOSCOW', 'PARIS', 5000, 2000000, 1000000 - 5000, 1000),
       (3, 'MELBOURNE', 'LONDON', 5000, 3000000, 1000000 - 5000, 1000),
       (10, 'MELBOURNE', 'LONDON', 10000, 45000000, 1000000 - 5000, 1000),
       (10, 'MELBOURNE', 'LONDON', 5001, 5000000, 1000000 - 5000, 1000)
;