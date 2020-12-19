package tech.itpark.skyscanner.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tech.itpark.skyscanner.manager.TicketManager;
import tech.itpark.skyscanner.model.Ticket;


import java.util.List;

@RestController
@RequestMapping("/tickets")
@RequiredArgsConstructor
public class TicketController {
    private final TicketManager manager;

    @GetMapping
    public List<Ticket> getAll(){
        return manager.getAll();
    }

    @GetMapping("/byFlight/{flightId}")
    public List<Ticket> getAll(@PathVariable long flightId) {
        return manager.getAllByFlightId(flightId);
    }

    @GetMapping("{ticketId}")
    public Ticket getById(@PathVariable long ticketId) {
        return manager.getById(ticketId);
    }

    @PostMapping
    public Ticket save(@RequestBody Ticket item) {
        return manager.save(item);
    }

    @DeleteMapping("/{ticketId}")
    public Ticket removeById(@PathVariable long ticketId) {
        return manager.removeById(ticketId);
    }

    @GetMapping("/search")
    public List<Ticket> search(
            @RequestParam String passengerName
    ) {
        return manager.search(passengerName);
    }
}
