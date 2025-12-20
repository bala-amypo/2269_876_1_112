package com.example.demo.service.impl;

import com.example.demo.entity.CredentialHolderProfile;
import com.example.demo.repository.CredentialHolderProfileRepository;
import com.example.demo.service.CredentialHolderProfileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CredentialHolderProfileServiceImpl
        implements CredentialHolderProfileService {

    private final CredentialHolderProfileRepository repository;

    public CredentialHolderProfileServiceImpl(
            CredentialHolderProfileRepository repository) {
        this.repository = repository;
    }

    @Override
    public CredentialHolderProfile create(CredentialHolderProfile profile) {
        profile.setActive(true);
        return repository.save(profile);
    }

    @Override
    public CredentialHolderProfile getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Credential Holder not found"));
    }

    @Override
    public List<CredentialHolderProfile> getAll() {
        return repository.findAll();
    }

    @Override
    public CredentialHolderProfile deactivate(Long id) {
        CredentialHolderProfile profile = getById(id);
        profile.setActive(false);
        return repository.save(profile);
    }
}
