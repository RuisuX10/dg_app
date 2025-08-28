package com.dg_app.dg_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dg_app.dg_app.model.Tenant;
import com.dg_app.dg_app.repository.TenantRepository;

@Service
public class TenantService implements ITenantService {

    @Autowired
    private TenantRepository tenantRepository;

    @Override
    public List<Tenant> getAllTenants() {
        
        List<Tenant> tenants = tenantRepository.findAll();
        return tenants;

    }

    @Override
    public Tenant getTenantById(Long id) {
        
        return tenantRepository.findById(id).orElse(null);
    }

    @Override
    public Tenant saveTenant(Tenant tenant) {
        return tenantRepository.save(tenant);
    }

    @Override
    public void deleteTenant(Long id) {
        
        tenantRepository.deleteById(id);
    }

    @Override
    public Tenant updateTenant(Long id, Tenant tenant) {
        
        return tenantRepository.save(tenant);
    
    }

}
