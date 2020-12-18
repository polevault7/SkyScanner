package tech.itpark.skyscanner.model;

import lombok.Value;

@Value
public class Ticket {
    long id;
    Flight flight;
    String passengerName;
}
