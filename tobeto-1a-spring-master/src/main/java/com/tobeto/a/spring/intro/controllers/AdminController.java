package com.tobeto.a.spring.intro.controllers;

import com.tobeto.a.spring.intro.entities.Admin;
import com.tobeto.a.spring.intro.repositories.AdminRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/admins")
public class AdminController {

    private final AdminRepository adminRepository;


    public AdminController(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @GetMapping
    public List<Admin> getAll() {
        List<Admin> admins = adminRepository.findAll();
        return admins;
    }

    @GetMapping("{id}")
    public Admin getById(@PathVariable int id) {
        return adminRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody Admin admin) {
        adminRepository.save(admin);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        Admin adminToDelete = adminRepository.findById(id).orElseThrow();
        adminRepository.delete(adminToDelete);
    }
    @PutMapping("{id}")
    public void update(@PathVariable int id, @RequestBody Admin admin) {
        Admin adminToUpdate = adminRepository.findById(id).orElseThrow();
        adminToUpdate.setAdminEmail(admin.getAdminEmail());
        adminToUpdate.setAdminPassword(admin.getAdminPassword());
        adminToUpdate.setId(admin.getId());
        adminToUpdate.setAge(admin.getAge());
        adminToUpdate.setGender(admin.getGender());
        adminToUpdate.setContactAddress(admin.getContactAddress());
        adminToUpdate.setFName(admin.getFName());
        adminToUpdate.setLName(admin.getLName());
        adminRepository.save(adminToUpdate);
    }
}
