package com.example.demo.service.impl;

import com.example.demo.entity.VerificationRequest;
import com.example.demo.repository.VerificationRequestRepository;
import com.example.demo.service.VerificationRequestService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VerificationRequestServiceImpl implements VerificationRequestService {

    private final VerificationRequestRepository verificationRequestRepository;

    public VerificationRequestServiceImpl(VerificationRequestRepository verificationRequestRepository) {
        this.verificationRequestRepository = verificationRequestRepository;
    }

    @Override
    public VerificationRequest createRequest(VerificationRequest request) {
        return verificationRequestRepository.save(request);
    }

    @Override
    public Optional<VerificationRequest> getRequestById(Long id) {
        return verificationRequestRepository.findById(id);
    }

    @Override
    public List<VerificationRequest> getAllRequests() {
        return verificationRequestRepository.findAll();
    }

    @Override
    public VerificationRequest updateRequest(VerificationRequest request) {
        return verificationRequestRepository.save(request);
    }

    @Override
    public void deleteRequest(Long id) {
        verificationRequestRepository.deleteById(id);
    }
}
