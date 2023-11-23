package com.tobeto.a.spring.intro.repositories;

import com.tobeto.a.spring.intro.entities.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental, Integer> {

}
