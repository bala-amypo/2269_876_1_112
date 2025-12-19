package com.example.demo.entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "verification_request")
public class VerificationRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long credentialId;

    @Column(nullable = false)
    private String requestedBy;

    @Column(nullable = false)
    private String verificationMethod;

    @Column(nullable = false)
    private String status;

    private LocalDateTime verifiedAt;

    private String resultMessage;

   
    public VerificationRequest() {
    }

    
    public VerificationRequest(
            Long id,
            Long credentialId,
            String requestedBy,
            String verificationMethod,
            String status,
            LocalDateTime verifiedAt,
            String resultMessage
    ) {
        this.id = id;
        this.credentialId = credentialId;
        this.requestedBy = requestedBy;
        this.verificationMethod = verificationMethod;
        this.status = status;
        this.verifiedAt = verifiedAt;
        this.resultMessage = resultMessage;
    }

   

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

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public String getVerificationMethod() {
        return verificationMethod;
    }

    public void setVerificationMethod(String verificationMethod) {
        this.verificationMethod = verificationMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getVerifiedAt() {
        return verifiedAt;
    }

    public void setVerifiedAt(LocalDateTime verifiedAt) {
        this.verifiedAt = verifiedAt;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }
}
