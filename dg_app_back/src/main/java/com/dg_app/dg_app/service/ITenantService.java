package com.dg_app.dg_app.service;

import java.util.List;

import com.dg_app.dg_app.model.Tenant;

public interface ITenantService {

    List<Tenant> getAllTenants();

    Tenant getTenantById(Long id);

    Tenant saveTenant(Tenant tenant);

    void deleteTenant(Long id);

    Tenant updateTenant(Long id, Tenant tenant);
    
}
