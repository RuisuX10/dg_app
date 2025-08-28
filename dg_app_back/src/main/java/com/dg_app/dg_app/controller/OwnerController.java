package com.dg_app.dg_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.dg_app.dg_app.model.Owner;
import com.dg_app.dg_app.service.IOwnerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("api/owner")
public class OwnerController {

    @Autowired
    private IOwnerService ownerService;

    @GetMapping("")
    public List<Owner> getAllOwners() {
        return ownerService.getAllOwners();
    }
    
    @PostMapping("")
    public Owner createOwner(@RequestBody Owner owner) {
        return ownerService.saveOwner(owner);
    }
    
}
