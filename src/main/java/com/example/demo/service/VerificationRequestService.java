package com.example.demo.service;

import com.example.demo.entity.VerificationRequest;

import java.util.List;
import java.util.Optional;

public interface VerificationRequestService {

    VerificationRequest createRequest(VerificationRequest request);

    Optional<VerificationRequest> getRequestById(Long id);

    List<VerificationRequest> getAllRequests();

    VerificationRequest updateRequest(VerificationRequest request);

    void deleteRequest(Long id);
}
