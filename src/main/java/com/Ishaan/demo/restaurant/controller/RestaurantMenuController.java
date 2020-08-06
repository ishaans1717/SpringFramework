package com.Ishaan.demo.restaurant.controller;

import com.Ishaan.demo.restaurant.entities.RestaurantInfo;
import com.Ishaan.demo.restaurant.entities.RestaurantMenu;
import com.Ishaan.demo.restaurant.service.RestaurantInfoService;
import com.Ishaan.demo.restaurant.service.RestaurantMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantMenuController {

    @Autowired
    RestaurantMenuService restaurantMenuService;

    @GetMapping("/restaurant/menu/")
    public List<RestaurantMenu> getRestaurantMenu(){return restaurantMenuService.getRestaurantMenu();}

    @GetMapping("/restaurant/menu/restaurant/{id}")
    public List<RestaurantMenu> getRestaurantMenuByRestaurantId(@PathVariable("id") int id){
        List<RestaurantMenu> restaurantMenus = restaurantMenuService.getRestaurantMenuByRestaurantId(id);

        return restaurantMenus;
    }

    @GetMapping("/restaurant/menu/dishname/{dishName}")
    public List<RestaurantMenu> getRestaurantMenuByDishName(@PathVariable("dishName") String dishName){
        List<RestaurantMenu> restaurantMenus = restaurantMenuService.getRestaurantMenuBydishName(dishName);

        return restaurantMenus;
    }

    @PostMapping("/restaurant/menu")
    public RestaurantMenu createRestaurantmenu(@RequestBody RestaurantMenu restaurantMenu){
        RestaurantInfo restaurantInfo = new RestaurantInfo();
        restaurantInfo.setId(restaurantMenu.getRestaurantId());
        restaurantMenu.setRestaurantInfo(restaurantInfo);
        return restaurantMenuService.createRestaurantmenu(restaurantMenu);
    }

}
