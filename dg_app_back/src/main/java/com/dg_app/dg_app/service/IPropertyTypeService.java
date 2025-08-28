package com.dg_app.dg_app.service;

import java.util.List;

import com.dg_app.dg_app.model.PropertyType;

public interface IPropertyTypeService {

    List<PropertyType> getAllPropertyTypes();

    PropertyType getPropertyTypeById(Long id);

    PropertyType savePropertyType(PropertyType propertyType);

    void deletePropertyType(Long id);

    PropertyType updatePropertyType(Long id, PropertyType propertyType);
    
}
