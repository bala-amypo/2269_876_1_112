package com.example.demo.controller;

import com.example.demo.entity.CredentialRecord;
import com.example.demo.service.CredentialRecordService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/credentials")
public class CredentialRecordController {

    private final CredentialRecordService service;

    public CredentialRecordController(CredentialRecordService service) {
        this.service = service;
    }

    @PostMapping
    public CredentialRecord create(@RequestBody CredentialRecord record) {
        return service.save(record);
    }

    @GetMapping("/{id}")
    public Optional<CredentialRecord> getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping
    public List<CredentialRecord> getAll() {
        return service.findAll();
    }

    @GetMapping("/expired")
    public List<CredentialRecord> getExpired(@RequestParam LocalDate date) {
        return service.findExpiredBefore(date);
    }

    @PutMapping("/{id}")
    public CredentialRecord update(@PathVariable Long id, @RequestBody CredentialRecord record) {
        return service.update(id, record);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}
