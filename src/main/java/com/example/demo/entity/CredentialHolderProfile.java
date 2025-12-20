package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(
    name = "credential_holder_profile",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "holderId"),
        @UniqueConstraint(columnNames = "email")
    }
)
public class CredentialHolderProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String holderId;

    @Column(nullable = false)
    private String fullname;

    @Column(nullable = false, unique = true)
    private String email;

    private boolean active;

    private String organization;

    private LocalDateTime createdAt;

    @OneToMany(
        mappedBy = "holder",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<CredentialRecord> credentials = new ArrayList<>();

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
        this.active = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHolderId() {
        return holderId;
    }

    public void setHolderId(String holderId) {
        this.holderId = holderId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public List<CredentialRecord> getCredentials() {
        return credentials;
    }

    public CredentialHolderProfile() {
    }

    public CredentialHolderProfile(
            Long id,
            String holderId,
            String fullname,
            String email,
            boolean active,
            String organization,
            LocalDateTime createdAt
    ) {
        this.id = id;
        this.holderId = holderId;
        this.fullname = fullname;
        this.email = email;
        this.active = active;
        this.organization = organization;
        this.createdAt = createdAt;
    }
}
