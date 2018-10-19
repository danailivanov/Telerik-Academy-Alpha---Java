package com.ivanov.restaurantsapp.restaurantsapp.service;

import com.ivanov.restaurantsapp.restaurantsapp.data.base.GenericRepository;
import com.ivanov.restaurantsapp.restaurantsapp.data.base.RestaurantsRepository;
import com.ivanov.restaurantsapp.restaurantsapp.models.Restaurant;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RestaurantsServiceImpl implements RestaurantsService {
    private GenericRepository<Restaurant> restaurantsRepository;

    @Override
    public List<Restaurant> listRestaurants() {
        return restaurantsRepository.listAll();
    }

    @Override
    public List<Restaurant> searchRestaurants(Predicate<Restaurant> condition) {
        return restaurantsRepository.modelsStream()
                .filter(condition)
                .collect(Collectors.toList());
    }

    @Override
    public Restaurant findById(int id) {
        return restaurantsRepository.findById(id);
    }

    @Override
    public void create(Restaurant restaurant) {
        restaurantsRepository.create(restaurant);
    }

    @Override
    public void update(int id, Restaurant restaurant) {
        restaurantsRepository.update(id, restaurant);
    }

    @Override
    public void delete(int id) {
        restaurantsRepository.delete(id);
    }
}
