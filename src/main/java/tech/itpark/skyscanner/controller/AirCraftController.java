package tech.itpark.skyscanner.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tech.itpark.skyscanner.manager.AirCraftManager;
import tech.itpark.skyscanner.model.AirCraft;

import java.util.List;

@RestController
@RequestMapping("/airCrafts")
@RequiredArgsConstructor
public class AirCraftController {
    private final AirCraftManager manager;

    @RequestMapping
    public List<AirCraft> getAll() {
        return manager.getAll();
    }

    @RequestMapping("/{id}")
    public AirCraft getById(@PathVariable long id) {
        return manager.getById(id);
    }

    @RequestMapping("/{id}/save")
    public AirCraft save(
            @PathVariable long id,
            @RequestParam String airline,
            @RequestParam String model,
            @RequestParam int capacity
    ) {
       return manager.save(new AirCraft(id, airline, model, capacity));
    }

    @RequestMapping("/{id}/remove")
    public AirCraft removeById(@PathVariable long id) {
       return manager.removeById(id);
    }

}
