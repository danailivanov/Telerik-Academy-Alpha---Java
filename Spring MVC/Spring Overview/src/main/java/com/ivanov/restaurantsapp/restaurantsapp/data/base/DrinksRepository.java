package com.ivanov.restaurantsapp.restaurantsapp.data.base;

import com.ivanov.restaurantsapp.restaurantsapp.models.Drink;

import java.util.List;

public interface DrinksRepository {
    List<Drink> listAll();

    Drink findById(int id);

    void create(Drink restaurant);

    void update(int id, Drink restaurant);

    void delete(int id);
}
