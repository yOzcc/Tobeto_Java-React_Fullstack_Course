package com.tobeto.a.spring.intro.controllers;

import com.tobeto.a.spring.intro.entities.Driver;
import com.tobeto.a.spring.intro.repositories.DriverRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/drivers")
public class DriversController {
    public final DriverRepository driverRepository;


    public DriversController(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @GetMapping
    public List<Driver> getAll() {
        List<Driver> drivers = driverRepository.findAll();
        return drivers;
    }

    @GetMapping("{id}")
    public Driver getById(@PathVariable int id) {
        return driverRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody Driver driver) {
        driverRepository.save(driver);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        Driver driverToDelete = driverRepository.findById(id).orElseThrow();
        driverRepository.delete(driverToDelete);
    }

    @PutMapping("{id}")
    public void update(@PathVariable int id, @RequestBody Driver driver) {
        Driver driverToUpdate = driverRepository.findById(id).orElseThrow();
        driverToUpdate.setDriverName(driver.getDriverName());
        driverToUpdate.setId(driver.getId());
        driverToUpdate.setCommission(driver.getCommission());
        driverRepository.save(driverToUpdate);
    }
}
