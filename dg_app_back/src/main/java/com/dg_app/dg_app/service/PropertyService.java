package com.dg_app.dg_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dg_app.dg_app.model.Property;
import com.dg_app.dg_app.repository.PropertyRepository;

@Service
public class PropertyService implements IPropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    @Override
    public List<Property> getAllProperties() {
        List<Property> properties = propertyRepository.findAll();
        return properties;
    }

    @Override
    public Property getPropertyById(Long id) {
        
        return propertyRepository.findById(id).orElse(null);
    }

    @Override
    public Property saveProperty(Property property) {

        return propertyRepository.save(property);
    }

    @Override
    public void deleteProperty(Long id) {
        
        propertyRepository.deleteById(id);

    }

    @Override
    public Property updateProperty(Long id, Property property) {
        
        Property existingProperty = propertyRepository.findById(id).orElse(null);
        if (existingProperty != null) {
            existingProperty.setAddress(property.getAddress());
            existingProperty.setRooms(property.getRooms());
            existingProperty.setLot(property.getLot());
            existingProperty.setCovered(property.getCovered());
            existingProperty.setSemi_covered(property.getSemi_covered());
            existingProperty.setPrice(property.getPrice());
            existingProperty.setOwner(property.getOwner());
            existingProperty.setPropertyType(property.getPropertyType());
            return propertyRepository.save(existingProperty);
        } else {
            return null;
        }
    }

    @Override
    public List<Property> getPropertiesByOwnerId(Long id) {
        
        List<Property> properties = propertyRepository.findAll().stream()
                .filter(property -> property.getOwner() != null && property.getOwner().getId().equals(id))
                .toList();
        return properties;

    }

    @Override
    public List<Property> getPropertiesByPropertyTypeId(Long id) {
        
        List<Property> properties = propertyRepository.findAll().stream()
                .filter(property -> property.getPropertyType().getId() == id)
                .toList();
        return properties;
        
    }

}
