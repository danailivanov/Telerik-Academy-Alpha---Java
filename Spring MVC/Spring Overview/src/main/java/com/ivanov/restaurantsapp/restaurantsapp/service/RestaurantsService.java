package com.ivanov.restaurantsapp.restaurantsapp.service;

import com.ivanov.restaurantsapp.restaurantsapp.models.Restaurant;

import java.util.List;
import java.util.function.Predicate;

public interface RestaurantsService {
    List<Restaurant> listRestaurants();

    List<Restaurant> searchRestaurants(Predicate<Restaurant> condition);

    Restaurant findById(int id);

    void create(Restaurant restaurant);

    void update(int id, Restaurant restaurant);

    void delete(int id);

}
//    int index = -1;
//        for (int i = 0; i < restaurants.size(); i++) {
//        if (restaurants.get(i).getId() == id) {
//        index = i;
//        break;
//        }
//        }
//        restaurants.remove(index);

