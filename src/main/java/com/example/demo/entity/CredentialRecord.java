package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Set;
import java.util.HashSet;

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

    @ManyToOne
    @JoinColumn(name = "holder_id", nullable = false)
    private CredentialHolderProfile holder;

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

    @ManyToMany
    @JoinTable(
        name = "credential_verification_rules",
        joinColumns = @JoinColumn(name = "credential_id"),
        inverseJoinColumns = @JoinColumn(name = "rule_id")
    )
    private Set<VerificationRule> rules = new HashSet<>();

    public CredentialRecord() {
    }

    public Long getId() {
        return id;
    }

    public CredentialHolderProfile getHolder() {
        return holder;
    }

    public void setHolder(CredentialHolderProfile holder) {
        this.holder = holder;
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

    public Set<VerificationRule> getRules() {
        return rules;
    }
}
