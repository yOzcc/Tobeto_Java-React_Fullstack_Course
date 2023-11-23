package com.tobeto.a.spring.intro.repositories;

import com.tobeto.a.spring.intro.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
