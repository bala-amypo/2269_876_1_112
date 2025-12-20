package com.example.demo.service;

import com.example.demo.entity.CredentialRecord;

import java.time.LocalDate;
import java.util.List;

public interface CredentialRecordService {

    CredentialRecord create(CredentialRecord record);

    CredentialRecord getById(Long id);

    List<CredentialRecord> findExpiredBefore(LocalDate date);

    List<CredentialRecord> findByStatus(String status);

    List<CredentialRecord> searchByIssuerAndType(String issuer, String type);

    List<CredentialRecord> findByHolderId(Long holderId);

    CredentialRecord findByCredentialCode(String code);
}
