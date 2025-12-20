package com.example.demo.controller;

import com.example.demo.entity.AuditTrailRecord;
import com.example.demo.service.AuditTrailService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/audit-trails")
public class AuditTrailController {

    private final AuditTrailService service;

    public AuditTrailController(AuditTrailService service) {
        this.service = service;
    }

    // Log an audit event
    @PostMapping
    public AuditTrailRecord logEvent(@RequestBody AuditTrailRecord record) {
        return service.logEvent(record);
    }

    // Get audit logs for a credential
    @GetMapping("/credential/{credentialId}")
    public List<AuditTrailRecord> getLogsByCredential(
            @PathVariable Long credentialId) {
        return service.getLogsByCredential(credentialId);
    }

    // Get all audit logs
    @GetMapping
    public List<AuditTrailRecord> getAllLogs() {
        return service.getAllLogs();
    }
}
