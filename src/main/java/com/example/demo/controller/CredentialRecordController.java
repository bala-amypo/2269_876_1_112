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

    private final CredentialRecordService credentialRecordService;

    public CredentialRecordController(CredentialRecordService credentialRecordService) {
        this.credentialRecordService = credentialRecordService;
    }

    @PostMapping
    public CredentialRecord create(@RequestBody CredentialRecord record) {
        return credentialRecordService.createCredential(record);
    }

    @GetMapping("/{id}")
    public Optional<CredentialRecord> getById(@PathVariable Long id) {
        return credentialRecordService.getCredentialById(id);
    }

    @GetMapping
    public List<CredentialRecord> getAll() {
        return credentialRecordService.getAllCredentials();
    }

    @GetMapping("/expired")
    public List<CredentialRecord> getExpired(@RequestParam LocalDate date) {
        return credentialRecordService.getExpiredCredentials(date);
    }

    @PutMapping("/{id}")
    public CredentialRecord update(@PathVariable Long id, @RequestBody CredentialRecord record) {
        return credentialRecordService.updateCredential(id, record);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        credentialRecordService.deleteCredential(id);
    }
}
