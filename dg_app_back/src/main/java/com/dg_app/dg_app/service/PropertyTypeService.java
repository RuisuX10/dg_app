package com.dg_app.dg_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dg_app.dg_app.model.PropertyType;
import com.dg_app.dg_app.repository.PropertyTypeRepository;

@Service
public class PropertyTypeService implements IPropertyTypeService {

    @Autowired
    private PropertyTypeRepository propertyTypeRepository;

    @Override
    public List<PropertyType> getAllPropertyTypes() {
        
        List<PropertyType> propertyTypes = propertyTypeRepository.findAll();
        return propertyTypes;

    }

    @Override
    public PropertyType getPropertyTypeById(Long id) {
        
        return propertyTypeRepository.findById(id.intValue()).orElse(null);

    }

    @Override
    public PropertyType savePropertyType(PropertyType propertyType) {
        
        return propertyTypeRepository.save(propertyType);
    }

    @Override
    public void deletePropertyType(Long id) {
        
        propertyTypeRepository.deleteById(id.intValue());

    }

    @Override
    public PropertyType updatePropertyType(Long id, PropertyType propertyType) {
        
        PropertyType existingPropertyType = propertyTypeRepository.findById(id.intValue()).orElse(null);
        if (existingPropertyType != null) {
            existingPropertyType.setName(propertyType.getName());
            return propertyTypeRepository.save(existingPropertyType);
        } else {
            return null;
        }
    }

}
