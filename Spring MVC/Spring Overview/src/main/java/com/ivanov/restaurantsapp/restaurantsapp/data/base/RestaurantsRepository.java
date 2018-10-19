package com.ivanov.restaurantsapp.restaurantsapp.data.base;

import com.ivanov.restaurantsapp.restaurantsapp.models.Restaurant;

import java.util.List;

public interface RestaurantsRepository {
    List<Restaurant> listAll();

    Restaurant findById(int id);

    void create(Restaurant restaurant);

    void update(int id, Restaurant restaurant);

    void delete(int id);
}
