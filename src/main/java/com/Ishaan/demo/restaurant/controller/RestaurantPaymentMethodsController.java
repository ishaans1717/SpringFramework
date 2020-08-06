package com.Ishaan.demo.restaurant.controller;

import com.Ishaan.demo.restaurant.entities.PaymentMethods;
import com.Ishaan.demo.restaurant.service.RestaurantPaymentMethodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantPaymentMethodsController {

    @Autowired
    RestaurantPaymentMethodsService restaurantPaymentMethodsService;

    @GetMapping("/restaurant/PaymentMethods/")
    public List<PaymentMethods> getPaymentMethods(){return restaurantPaymentMethodsService.getPaymentMethods();}

}

