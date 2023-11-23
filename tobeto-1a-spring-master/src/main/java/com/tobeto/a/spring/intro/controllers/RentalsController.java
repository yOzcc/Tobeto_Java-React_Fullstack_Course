package com.tobeto.a.spring.intro.controllers;

import com.tobeto.a.spring.intro.entities.Rental;
import org.springframework.web.bind.annotation.*;
import com.tobeto.a.spring.intro.repositories.RentalRepository;


import java.util.List;

@RestController
@RequestMapping("api/rentals")
public class RentalsController {

    private final RentalRepository rentalRepository;

    public RentalsController(RentalRepository rentalRepository) {
        this.rentalRepository = rentalRepository;
    }

    @GetMapping
    public List<Rental> getAll() {
        List<Rental> rentals = rentalRepository.findAll();
        return rentals;
    }

    @GetMapping("{id}")
    public Rental getById(@PathVariable int id) {
        return rentalRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody Rental rental) {
        rentalRepository.save(rental);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        Rental rentalToDelete = rentalRepository.findById(id).orElseThrow();
        rentalRepository.delete(rentalToDelete);
    }

    @PutMapping("{id}")
    public void update(@PathVariable int id, @RequestBody Rental rental) {
        Rental rentalToUpdate = rentalRepository.findById(id).orElseThrow();
        rentalToUpdate.setRentalNum(rental.getRentalNum());
        rentalToUpdate.setId(rental.getId());
        rentalToUpdate.setDateRent(rental.getDateRent());
        rentalToUpdate.setTimeDepart(rental.getTimeDepart());
        rentalToUpdate.setTimeArrive(rental.getTimeArrive());
        rentalToUpdate.setDestination(rental.getDestination());
        rentalToUpdate.setDateReturn(rental.getDateReturn());
        rentalToUpdate.setPayment(rental.getPayment());
        rentalRepository.save(rentalToUpdate);
    }
}
