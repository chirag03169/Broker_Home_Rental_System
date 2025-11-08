package com.example.BrokerListProperties.service;

import com.example.BrokerListProperties.entity.Property;
import com.example.BrokerListProperties.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    @Override
    public Property saveProperty(Property property) {
        return propertyRepository.save(property);
    }
}
