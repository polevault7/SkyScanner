package tech.itpark.skyscanner.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tech.itpark.skyscanner.manager.FlightManager;
import tech.itpark.skyscanner.model.Flight;

import java.util.List;

@RestController
@RequestMapping("/flights")
@RequiredArgsConstructor
public class FlightController {
    private final FlightManager manager;

    @GetMapping
    public List<Flight> getAll() {
        return manager.getAll();
    }

    @GetMapping("/{id}")
    public Flight getById(@PathVariable long id) {
        return manager.getById(id);
    }

    @GetMapping("/by-aircraft/{aircraftId}")
    public List<Flight> getByAircraftId(@PathVariable long aircraftId) {
        return manager.getByAircraftId(aircraftId);
    }

    @PostMapping
    public Flight save(@RequestBody Flight item) {
        return manager.save(item);
    }


    @DeleteMapping("/{id}")
    public Flight removeById(@PathVariable long id) {
        return manager.removeById(id);
    }

    @GetMapping("/search")
    public List<Flight> search(
            @RequestParam String sourceCity,
            @RequestParam String destCity,
            @RequestParam String departureTime
    ) {
        return manager.search(sourceCity, destCity, departureTime);
    }

    @GetMapping("search/return")
    public List<Flight> search(
            @RequestParam String sourceCity,
            @RequestParam String destCity,
            @RequestParam String departureTime,
            @RequestParam String departureTimeBack
    ) {
        return manager.search(sourceCity, destCity, departureTime, departureTimeBack);
    }

    @GetMapping("/sort/price")
    public List<Flight> sortByPrice(
            @RequestParam String sourceCity,
            @RequestParam String destCity,
            @RequestParam String departureTime
    ) {
        return manager.sortByPrice(sourceCity, destCity, departureTime);
    }
    @GetMapping("/sort/departure")
    public List<Flight> sortByJourneyDuration(
            @RequestParam String sourceCity,
            @RequestParam String destCity,
            @RequestParam String departureTime
    ) {
        return manager.sortByJourneyDuration(sourceCity, destCity, departureTime);
    }
}
