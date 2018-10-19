package com.ivanov.restaurantsapp.restaurantsapp.data;

import com.ivanov.restaurantsapp.restaurantsapp.data.base.GenericRepository;
import com.ivanov.restaurantsapp.restaurantsapp.data.base.RestaurantsRepository;
import com.ivanov.restaurantsapp.restaurantsapp.models.Restaurant;

import java.util.List;

public class RestaurantsRepositoryImpl implements GenericRepository<Restaurant> {
    @Override
    public List<Restaurant> listAll() {
        return null;
    }

    @Override
    public Restaurant findById(int id) {
        return null;
    }

    @Override
    public void create(Restaurant restaurant) {

    }

    @Override
    public void update(int id, Restaurant restaurant) {

    }

    @Override
    public void delete(int id) {

    }
}
