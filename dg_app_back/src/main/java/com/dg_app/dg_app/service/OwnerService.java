package com.dg_app.dg_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dg_app.dg_app.model.Owner;
import com.dg_app.dg_app.repository.OwnerRepository;

@Service
public class OwnerService implements IOwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public List<Owner> getAllOwners() {
        
        List<Owner> owners = ownerRepository.findAll();
        return owners;

    }

    @Override
    public Owner getOwnerById(Long id) {
        
        Owner owner = ownerRepository.findById(id).orElse(null);
        return owner;
    }

    @Override
    public Owner saveOwner(Owner owner) {
        
        return ownerRepository.save(owner);

    }

    @Override
    public void deleteOwner(Long id) {
        
        ownerRepository.deleteById(id);

    }

    @Override
    public Owner updateOwner(Long id, Owner owner) {
        
        Owner existingOwner = ownerRepository.findById(id).orElse(null);
        if (existingOwner != null) {
            existingOwner.setName(owner.getName());
            existingOwner.setLast_name(owner.getLast_name());
            existingOwner.setDni(owner.getDni());
            existingOwner.setPhone(owner.getPhone());
            existingOwner.setEmail(owner.getEmail());
            return ownerRepository.save(existingOwner);
        } else {
            return null;
        }
    }

}
