package com.Ishaan.demo.restaurant.service;

import com.Ishaan.demo.restaurant.controller.RestaurantMenuController;
import com.Ishaan.demo.restaurant.entities.RestaurantInfo;
import com.Ishaan.demo.restaurant.entities.RestaurantMenu;
import com.Ishaan.demo.restaurant.repositories.RestaurantMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantMenuService {
    public List<RestaurantMenu> getRestaurantMenu() {
        List<RestaurantMenu> restaurantMenus = new ArrayList<>();
        Iterable<RestaurantMenu> restaurantMenuIterable = restaurantMenuRepository.findAll();
        restaurantMenuIterable.forEach(restaurantMenus::add);
        return restaurantMenus;
    }
    @Autowired
    RestaurantMenuRepository restaurantMenuRepository;
    public RestaurantMenu createRestaurantmenu(RestaurantMenu restaurantMenu) {
        RestaurantMenu restaurantMenu1 = restaurantMenuRepository.save(restaurantMenu);
        restaurantMenu1.setRestaurantId(restaurantMenu.getRestaurantId());
        return restaurantMenu1;
    }

    public List<RestaurantMenu> getRestaurantMenuByRestaurantId(int id) {
        return  restaurantMenuRepository.findByRestaurantInfo_Id(id);
    }

    public List<RestaurantMenu> getRestaurantMenuBydishName(String dishName) {
        return restaurantMenuRepository.findByDishName(dishName);
    }
}
