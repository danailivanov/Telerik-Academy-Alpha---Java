package com.ivanov.restaurantsapp.restaurantsapp.data.base;

import java.util.List;
import java.util.stream.Stream;

public interface GenericRepository<T> {
    List<T> listAll();

    Stream<T> modelsStream();

    T findById(int id);

    void create(T restaurant);

    void update(int id, T restaurant);

    void delete(int id);
}
