package com.example.BrokerListProperties.controller;
import com.example.BrokerListProperties.entity.Property;
import com.example.BrokerListProperties.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/properties")
@CrossOrigin(origins = "*")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @PostMapping
    public Property addProperty(@RequestBody Property property) {
        return propertyService.saveProperty(property);
    }
}
