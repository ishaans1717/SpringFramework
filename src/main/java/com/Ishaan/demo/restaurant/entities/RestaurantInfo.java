package com.Ishaan.demo.restaurant.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "restaurantinfo")
public class RestaurantInfo implements Serializable {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Phone")
    private String phone;
    @Column(name = "Email")
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressid", referencedColumnName = "id")
    private Address address;
    @OneToMany(mappedBy = "restaurantInfo", fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    @JsonIgnore
    private Set<RestaurantMenu> restaurantMenuset;

    public Set<RestaurantMenu> getRestaurantMenuset() {
        return restaurantMenuset;
    }

    public void setRestaurantMenuset(Set<RestaurantMenu> restaurantMenuset) {
        this.restaurantMenuset = restaurantMenuset;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
