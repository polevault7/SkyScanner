package tech.itpark.skyscanner.model;

import lombok.Value;

@Value
public class AirCraft {
    long id;
    String airline;
    String model;
    int capacity;

}

