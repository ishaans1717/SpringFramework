package com.Ishaan.demo.restaurant.repositories;

import com.Ishaan.demo.restaurant.entities.RestaurantMenu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantMenuRepository extends CrudRepository<RestaurantMenu,Integer> {

    public List<RestaurantMenu> findByRestaurantInfo_Id(int id);
    public List<RestaurantMenu> findByDishName(String dishName);
}
