package com.example.demo.controller;

import com.example.demo.entity.VerificationRequest;
import com.example.demo.service.VerificationRequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/verification-requests")
public class VerificationRequestController {

    private final VerificationRequestService service;

    public VerificationRequestController(VerificationRequestService service) {
        this.service = service;
    }

    @PostMapping
    public VerificationRequest createRequest(@RequestBody VerificationRequest request) {
        return service.createRequest(request);
    }

    @GetMapping("/{id}")
    public Optional<VerificationRequest> getRequestById(@PathVariable Long id) {
        return service.getRequestById(id);
    }

    @GetMapping
    public List<VerificationRequest> getAllRequests() {
        return service.getAllRequests();
    }

    @PutMapping
    public VerificationRequest updateRequest(@RequestBody VerificationRequest request) {
        return service.updateRequest(request);
    }

    @DeleteMapping("/{id}")
    public void deleteRequest(@PathVariable Long id) {
        service.deleteRequest(id);
    }
}
