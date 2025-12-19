package com.example.demo.entity;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity

public class CredentialHolderProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String holderId;
    private String fullname;
    @Column(unique=true)
    private String email;
    private boolean active;
    private String organization;
    private LocalDateTime createAt;
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
    public LocalDateTime getCreateAt() {
        return createAt;
    }
    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }
    public CredentialHolderProfile(Long id, String holderId, String fullname, String email, boolean active,
            String organization, LocalDateTime createAt) {
        this.id = id;
        this.holderId = holderId;
        this.fullname = fullname;
        this.email = email;
        this.active = active;
        this.organization = organization;
        this.createAt = createAt;
    }
    public CredentialHolderProfile() {
    }
}
