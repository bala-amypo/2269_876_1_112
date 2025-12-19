package com.example.demo.entity;
import jakarta.persistence.*;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(
    name = "credential_record",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "credentialCode")
    }
)
public class CredentialRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long holderId;

    @Column(nullable = false, unique = true)
    private String credentialCode;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String issuer;

    private LocalDate issueDate;

    private LocalDate expiryDate;

    @Column(nullable = false)
    private String credentialType;

    @Column(nullable = false)
    private String status;

    @Column(columnDefinition = "TEXT")
    private String metadataJson;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHolderId() {
        return holderId;
    }

    public void setHolderId(Long holderId) {
        this.holderId = holderId;
    }

    public String getCredentialCode() {
        return credentialCode;
    }

    public void setCredentialCode(String credentialCode) {
        this.credentialCode = credentialCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCredentialType() {
        return credentialType;
    }

    public void setCredentialType(String credentialType) {
        this.credentialType = credentialType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMetadataJson() {
        return metadataJson;
    }

    public void setMetadataJson(String metadataJson) {
        this.metadataJson = metadataJson;
    }

    public CredentialRecord(Long id, Long holderId, String credentialCode, String title, String issuer,
            LocalDate issueDate, LocalDate expiryDate, String credentialType, String status, String metadataJson) {
        this.id = id;
        this.holderId = holderId;
        this.credentialCode = credentialCode;
        this.title = title;
        this.issuer = issuer;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.credentialType = credentialType;
        this.status = status;
        this.metadataJson = metadataJson;
    }

    public CredentialRecord() {
    }
    

   
    

}