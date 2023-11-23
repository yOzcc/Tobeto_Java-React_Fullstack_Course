package com.tobeto.a.spring.intro.controllers;

import com.tobeto.a.spring.intro.entities.Report;
import com.tobeto.a.spring.intro.repositories.ReportRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/reports")
public class ReportsController {
    public final ReportRepository reportRepository;

    public ReportsController(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    @GetMapping
    public List<Report> getAll() {
        List<Report> reports = reportRepository.findAll();
        return reports;
    }

    @GetMapping("{id}")
    public Report getById(@PathVariable int id) {
        return reportRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody Report report) {
        reportRepository.save(report);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        Report reportToDelete = reportRepository.findById(id).orElseThrow();
        reportRepository.delete(reportToDelete);
    }

    @PutMapping("{id}")
    public void update(@PathVariable int id, @RequestBody Report report) {
        Report reportToUpdate = reportRepository.findById(id).orElseThrow();
        reportToUpdate.setReportDate(report.getReportDate());
        reportToUpdate.setId(report.getId());
        reportToUpdate.setTransaction(report.getTransaction());
        reportToUpdate.setRental(report.getRental());
        reportRepository.save(reportToUpdate);
    }
}
