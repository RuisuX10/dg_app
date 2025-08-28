package com.dg_app.dg_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dg_app.dg_app.model.Property;
import com.dg_app.dg_app.service.IPropertyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("api/property")
public class PropertyController {

    @Autowired
    private IPropertyService propertyService;

    @GetMapping("")
    public List<Property> getAllProperties() {

        return propertyService.getAllProperties();

    }

    @PostMapping("")
    public Property createProperty(@RequestBody Property property) {
        
        return propertyService.saveProperty(property);
        
    }
    
    
}
