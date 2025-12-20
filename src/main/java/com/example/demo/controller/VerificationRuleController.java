package com.example.demo.controller;

import com.example.demo.entity.VerificationRule;
import com.example.demo.service.VerificationRuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/verification-rules")
public class VerificationRuleController {

    private final VerificationRuleService service;

    public VerificationRuleController(VerificationRuleService service) {
        this.service = service;
    }

    @PostMapping
    public VerificationRule createRule(@RequestBody VerificationRule rule) {
        return service.createRule(rule);
    }

    @GetMapping("/{id}")
    public Optional<VerificationRule> getRuleById(@PathVariable Long id) {
        return service.getRuleById(id);
    }

    @GetMapping
    public List<VerificationRule> getAllRules() {
        return service.getAllRules();
    }

    @PutMapping("/{id}")
    public VerificationRule updateRule(
            @PathVariable Long id,
            @RequestBody VerificationRule rule) {
        return service.updateRule(id, rule);
    }

    @DeleteMapping("/{id}")
    public void deleteRule(@PathVariable Long id) {
        service.deleteRule(id);
    }
}
