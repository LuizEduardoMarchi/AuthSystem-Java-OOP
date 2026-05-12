package com.auth.model;

public class City {
    
    // Attributes.
    private Long cityID;
    private String nameCity;
    private String state;
    private String country;

    // Attribute from address.
    private Address address;

    // Getter and Setter for NameCity.
    public String getNameCity() {
        return this.nameCity;
    }
    
    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    // Getter and Setter for State.
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // Getter and Setter for country.
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
