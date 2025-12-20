package com.example.demo.service;

import com.example.demo.entity.VerificationRule;

import java.util.List;
import java.util.Optional;

public interface VerificationRuleService {

    VerificationRule createRule(VerificationRule rule);

    Optional<VerificationRule> getRuleById(Long id);

    List<VerificationRule> getAllRules();

    VerificationRule updateRule(Long id, VerificationRule rule);

    void deleteRule(Long id);
}
