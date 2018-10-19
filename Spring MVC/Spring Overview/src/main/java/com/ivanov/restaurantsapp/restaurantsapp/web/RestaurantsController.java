package com.ivanov.restaurantsapp.restaurantsapp.web;

import com.ivanov.restaurantsapp.restaurantsapp.models.Restaurant;
import com.ivanov.restaurantsapp.restaurantsapp.service.RestaurantsService;
import com.ivanov.restaurantsapp.restaurantsapp.service.RestaurantsServiceImpl;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantsController {
    private RestaurantsService restaurantsService;

    public RestaurantsController(){
        this(new RestaurantsServiceImpl());
    }

    public RestaurantsController(RestaurantsService restaurantsService) {
        this.restaurantsService = restaurantsService;

    }

    // GET /api/restaurants
    @RequestMapping(
            value = "/",
            method = RequestMethod.GET)
    public List<Restaurant> listRestaurants() {
        return restaurantsService.listRestaurants();
    }

    // GET /api/restaurants/{id}
    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.GET)
    public Restaurant findById(@PathVariable("id") String idString) {
        int id = Integer.parseInt(idString);
        return restaurantsService.findById(id);
    }

    @RequestMapping(
            value = "/",
            method = RequestMethod.POST)
    public void addRestaurants(@RequestBody Restaurant restaurant) {
        restaurantsService.create(restaurant);
    }

    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.PUT)
    public void update(@PathVariable("id") String idString, @RequestBody Restaurant updateRestaurant) {
        int id = Integer.parseInt(idString);
        restaurantsService.update(id, updateRestaurant);
    }

    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.DELETE)
    public void remove(@PathVariable("id") String idString) {
        int id = Integer.parseInt(idString);
        restaurantsService.delete(id);
    }

}
