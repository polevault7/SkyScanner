package tech.itpark.skyscanner.controller;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.LifecycleState;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tech.itpark.skyscanner.manager.FlightManager;
import tech.itpark.skyscanner.model.Flight;

import java.util.List;

@RestController
@RequestMapping("/flights")
@RequiredArgsConstructor
public class FlightController {
    private final FlightManager manager;

    @RequestMapping
    public List<Flight> getAll() {
        return manager.getAll();
    }

    @RequestMapping("/{id}")
    public Flight getById(@PathVariable long id) {
        return manager.getById(id);
    }

    @RequestMapping("/aircrafts/{id}")
    public List<Flight> getByAircraftId(@PathVariable long id) {
        return manager.getByAircraftId(id);
    }

    @RequestMapping("/{id}/save")
    public Flight save(
            @PathVariable long id,
            @RequestParam long aircraftId,
            @RequestParam String sourceCity,
            @RequestParam String destCity,
            @RequestParam long departureTime,
            @RequestParam long arrivalTime,
            @RequestParam long journeyDuration,
            @RequestParam int price
    ) {
        return manager.save(new Flight
                (id, aircraftId, sourceCity, destCity, departureTime, arrivalTime, journeyDuration, price));
    }

    @RequestMapping("/{id}/delete")
    public Flight removeById(@PathVariable long id) {
        return manager.removeById(id);
    }
@RequestMapping("/search")
    public List<Flight> search(
            @RequestParam String sourceCity,
            @RequestParam String destCity,
            @RequestParam long departureTime
    ) {
        return manager.search(sourceCity, destCity, departureTime);
    }
}
