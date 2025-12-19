package com.example.demo.entity;
import java.time.LocalDateTime;
import jakarta.persistence.*;


@Entity
@Table(name = "audit_trail_record")
public class AuditTrailRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long credentialId;

    @Column(nullable = false)
    private String eventType;

    @Column(length = 1000)
    private String details;

    @Column(nullable = false, updatable = false)
    private LocalDateTime loggedAt;

    @PrePersist
    protected void onCreate() {
        this.loggedAt = LocalDateTime.now();
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(Long credentialId) {
        this.credentialId = credentialId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDateTime getLoggedAt() {
        return loggedAt;
    }

    public AuditTrailRecord(Long id, Long credentialId, String eventType, String details, LocalDateTime loggedAt) {
        this.id = id;
        this.credentialId = credentialId;
        this.eventType = eventType;
        this.details = details;
        this.loggedAt = loggedAt;
    }

    public AuditTrailRecord() {
    }
    

    // No setter for loggedAt (auto-generated)
}