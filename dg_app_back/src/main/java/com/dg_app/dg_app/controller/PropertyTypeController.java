package com.dg_app.dg_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dg_app.dg_app.model.PropertyType;
import com.dg_app.dg_app.service.IPropertyTypeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("api/propertytype/")
public class PropertyTypeController {

    @Autowired
    private IPropertyTypeService propertyTypeService;

    @GetMapping("")
    public List<PropertyType> getAllPropertyTypes() {
        return propertyTypeService.getAllPropertyTypes();
    }
    
    @PostMapping("")
    public PropertyType createPropertyType(@RequestBody PropertyType propertyType) {

        return propertyTypeService.savePropertyType(propertyType);

    }
    
}
