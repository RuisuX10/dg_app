package com.dg_app.dg_app.service;

import java.util.List;

import com.dg_app.dg_app.model.Property;

public interface IPropertyService {

    public List<Property> getAllProperties();

    public Property getPropertyById(Long id);

    public Property saveProperty(Property property);

    public void deleteProperty(Long id);

    public Property updateProperty(Long id, Property property);

    public List<Property> getPropertiesByOwnerId(Long id);

    public List<Property> getPropertiesByPropertyTypeId(Long id);
}   
