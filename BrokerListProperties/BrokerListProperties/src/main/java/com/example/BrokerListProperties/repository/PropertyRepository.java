package com.example.BrokerListProperties.repository;

import com.example.BrokerListProperties.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {}
