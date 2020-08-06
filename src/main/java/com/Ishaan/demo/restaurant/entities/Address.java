package com.Ishaan.demo.restaurant.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String state;
    private String city;
    @Column(name = "zipcode")
    private String zipCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RestaurantInfo getRestaurantInfo() {
        return restaurantInfo;
    }

    public void setRestaurantInfo(RestaurantInfo restaurantInfo) {
        this.restaurantInfo = restaurantInfo;
    }

    @Column(name = "streetname")
    private String streetName;
    @OneToOne(mappedBy = "address")
    @JsonIgnore
    private RestaurantInfo restaurantInfo;
    public String getState(){return state;}
    public void setState(String state){this.state= state;}
    public String getCity(){return city;}
    public void setCity(String city){this.city=city;}
    public String getZipCode(){return zipCode;}
    public void setZipCode(String zipCode){this.zipCode = zipCode;}
    public String getStreetName(){return streetName;}
    public void setStreetName(String streetName){this.streetName = streetName;}
}
