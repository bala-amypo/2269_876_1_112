package com.example.demo.controller;

import com.example.demo.entity.CredentialHolderProfile;
import com.example.demo.service.CredentialHolderProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/holders")
public class CredentialHolderController {

    private final CredentialHolderProfileService service;

    public CredentialHolderController(CredentialHolderProfileService service) {
        this.service = service;
    }

    @PostMapping
    public CredentialHolderProfile create(@RequestBody CredentialHolderProfile profile) {
        return service.create(profile);
    }

    @GetMapping("/{id}")
    public CredentialHolderProfile getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<CredentialHolderProfile> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}/deactivate")
    public CredentialHolderProfile deactivate(@PathVariable Long id) {
        return service.deactivate(id);
    }
}
