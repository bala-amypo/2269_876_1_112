package com.example.demo.controller;

import com.example.demo.entity.CredentialRecord;
import com.example.demo.service.CredentialRecordService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/credentials")
public class CredentialRecordController {

    private final CredentialRecordService service;

    public CredentialRecordController(CredentialRecordService service) {
        this.service = service;
    }

    @PostMapping
    public CredentialRecord create(@RequestBody CredentialRecord record) {
        return service.create(record);
    }

    @GetMapping("/{id}")
    public CredentialRecord getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping("/expired")
    public List<CredentialRecord> getExpired(@RequestParam LocalDate date) {
        return service.findExpiredBefore(date);
    }

    @GetMapping("/status/{status}")
    public List<CredentialRecord> getByStatus(@PathVariable String status) {
        return service.findByStatus(status);
    }

    @GetMapping("/search")
    public List<CredentialRecord> search(
            @RequestParam String issuer,
            @RequestParam String type) {
        return service.searchByIssuerAndType(issuer, type);
    }

    @GetMapping("/holder/{holderId}")
    public List<CredentialRecord> getByHolder(@PathVariable Long holderId) {
        return service.findByHolderId(holderId);
    }

    @GetMapping("/code/{code}")
    public CredentialRecord getByCode(@PathVariable String code) {
        return service.findByCredentialCode(code);
    }
}
