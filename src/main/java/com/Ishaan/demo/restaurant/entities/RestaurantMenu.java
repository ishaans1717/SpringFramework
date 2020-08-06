package com.Ishaan.demo.restaurant.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "restaurauntmenu")
public class RestaurantMenu  {
    @Id
    private int id;
    @Column(name = "dishname")
    private String dishName;

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    private String size;
    private String prize;
    private String type;
    @Transient
    private int restaurantId;
    public RestaurantInfo getRestaurantInfo() {
        return restaurantInfo;
    }

    public void setRestaurantInfo(RestaurantInfo restaurantInfo) {
        this.restaurantInfo = restaurantInfo;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "restaurantinfoid", nullable = false)
    @JsonIgnore
    private RestaurantInfo restaurantInfo;
    public int getId(){return id;}
    public void setId(int id){this.id = id;}
    public String getDishName(){return dishName;}
    public void setDishName(String dishName){ this.dishName = dishName;}
    public String getSize(){return size;}
    public void setSize(String size){this.size = size;}
    public String getPrize(){return prize;}
    public void setPrize(String prize){this.prize = prize;}
    public String getType(){return type;}
    public void setType(String type){this.type = type;}


}