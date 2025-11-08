package com.example.BrokerListProperties.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Table(name = "Listed_Properties")
@Entity
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phoneNumber;
    private String address;
    private String postalCode;
    private String city;
    private String state;
    private String location;
    private String rentPrice; // Use Integer or Double if appropriate

    // Getter and Setter for id
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and Setter for postalCode
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    // Getter and Setter for city
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    // Getter and Setter for state
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    // Getter and Setter for location
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    // Getter and Setter for rentPrice
    public String getRentPrice() {
        return rentPrice;
    }
    public void setRentPrice(String rentPrice) {
        this.rentPrice = rentPrice;
    }
}
