package com.tobeto.a.spring.intro.repositories;

import com.tobeto.a.spring.intro.entities.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report,Integer> {
}
