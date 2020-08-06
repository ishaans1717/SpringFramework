package com.Ishaan.demo.restaurant.controller;

import com.Ishaan.demo.restaurant.entities.RestaurantInfo;
import com.Ishaan.demo.restaurant.service.RestaurantInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantInfoController {

    @Autowired
    RestaurantInfoService restaurantInfoService;

    @GetMapping("/restaurant/info")
    public List<RestaurantInfo> getRestaurantInfo(){
        return restaurantInfoService.getRestaurantInfo();
    }

    @GetMapping("/restaurant/info/{id}")
    public RestaurantInfo getRestaurantInfoById(@PathVariable("id") int id){
        RestaurantInfo restaurantInfos = restaurantInfoService.getRestaurantInfoByid(id);

        return restaurantInfos;
    }

    @PostMapping("/restaurant/info")
    public RestaurantInfo createRestaurant(@RequestBody RestaurantInfo restaurantInfo){

        return restaurantInfoService.createRestaurant(restaurantInfo);
    }
}
