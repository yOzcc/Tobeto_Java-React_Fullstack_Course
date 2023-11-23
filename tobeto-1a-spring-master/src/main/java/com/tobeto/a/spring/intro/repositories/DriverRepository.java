package com.tobeto.a.spring.intro.repositories;

import com.tobeto.a.spring.intro.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver,Integer> {
}
