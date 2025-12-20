package com.example.demo.service.impl;

import com.example.demo.entity.CredentialRecord;
import com.example.demo.repository.CredentialRecordRepository;
import com.example.demo.service.CredentialRecordService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CredentialRecordServiceImpl
        implements CredentialRecordService {

    private final CredentialRecordRepository repository;

    public CredentialRecordServiceImpl(
            CredentialRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public CredentialRecord create(CredentialRecord record) {
        return repository.save(record);
    }

    @Override
    public CredentialRecord getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Credential not found"));
    }

    @Override
    public List<CredentialRecord> findExpiredBefore(LocalDate date) {
        return repository.findExpiredBefore(date);
    }

    @Override
    public List<CredentialRecord> findByStatus(String status) {
        return repository.findByStatusUsingHql(status);
    }

    @Override
    public List<CredentialRecord> searchByIssuerAndType(String issuer, String type) {
        return repository.searchByIssuerAndType(issuer, type);
    }

    @Override
    public List<CredentialRecord> findByHolderId(Long holderId) {
        return repository.findByHolderId(holderId);
    }

    @Override
    public CredentialRecord findByCredentialCode(String code) {
        return repository.findByCredentialCode(code);
    }
}
