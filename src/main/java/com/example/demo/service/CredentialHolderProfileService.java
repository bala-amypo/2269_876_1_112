package com.example.demo.service;

import com.example.demo.entity.CredentialHolderProfile;

import java.util.List;

public interface CredentialHolderProfileService {

    CredentialHolderProfile create(CredentialHolderProfile profile);

    CredentialHolderProfile getById(Long id);

    List<CredentialHolderProfile> getAll();

    CredentialHolderProfile deactivate(Long id);
}
