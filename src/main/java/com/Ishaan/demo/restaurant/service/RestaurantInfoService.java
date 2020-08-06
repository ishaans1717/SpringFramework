package com.Ishaan.demo.restaurant.service;

import com.Ishaan.demo.restaurant.entities.RestaurantInfo;
import com.Ishaan.demo.restaurant.repositories.RestaurantInfoRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantInfoService {
    @Autowired
    RestaurantInfoRepositories restaurantInfoRepositories;

    public List<RestaurantInfo> getRestaurantInfo(){
        List<RestaurantInfo> restaurantInfos = new ArrayList<>();
        Iterable<RestaurantInfo> restaurantInfoIterable =restaurantInfoRepositories.findAll();
        restaurantInfoIterable.forEach(restaurantInfos::add);
        return restaurantInfos;
    }
    public RestaurantInfo createRestaurant(RestaurantInfo restaurantInfo){
        return restaurantInfoRepositories.save(restaurantInfo);
    }

    public RestaurantInfo getRestaurantInfoByid(int id) {
        return restaurantInfoRepositories.findById(id).get();
    }
}
