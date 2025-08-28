package com.dg_app.dg_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dg_app.dg_app.model.Tenant;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, Long> {

}
