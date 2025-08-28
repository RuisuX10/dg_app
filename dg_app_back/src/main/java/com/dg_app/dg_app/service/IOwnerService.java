package com.dg_app.dg_app.service;

import java.util.List;

import com.dg_app.dg_app.model.Owner;

public interface IOwnerService {

    List<Owner> getAllOwners();

    Owner getOwnerById(Long id);

    Owner saveOwner(Owner owner);

    void deleteOwner(Long id);

    Owner updateOwner(Long id, Owner owner);

}
