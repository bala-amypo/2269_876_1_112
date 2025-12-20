package com.example.demo.service.impl;

import com.example.demo.entity.VerificationRule;
import com.example.demo.repository.VerificationRuleRepository;
import com.example.demo.service.VerificationRuleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VerificationRuleServiceImpl implements VerificationRuleService {

    private final VerificationRuleRepository verificationRuleRepository;

    public VerificationRuleServiceImpl(VerificationRuleRepository verificationRuleRepository) {
        this.verificationRuleRepository = verificationRuleRepository;
    }

    @Override
    public VerificationRule createRule(VerificationRule rule) {
        return verificationRuleRepository.save(rule);
    }

    @Override
    public Optional<VerificationRule> getRuleById(Long id) {
        return verificationRuleRepository.findById(id);
    }

    @Override
    public List<VerificationRule> getAllRules() {
        return verificationRuleRepository.findAll();
    }

    @Override
    public VerificationRule updateRule(Long id, VerificationRule rule) {
        return verificationRuleRepository.findById(id)
                .map(existing -> verificationRuleRepository.save(rule))
                .orElseThrow(() -> new RuntimeException("Rule not found"));
    }

    @Override
    public void deleteRule(Long id) {
        verificationRuleRepository.deleteById(id);
    }
}
