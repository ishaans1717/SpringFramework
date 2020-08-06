package com.Ishaan.demo.restaurant.repositories;

import com.Ishaan.demo.restaurant.entities.RestaurantInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantInfoRepositories extends CrudRepository<RestaurantInfo,Integer> {
}
