package com.ratefood.app.controller;

import com.ratefood.app.entity.Dish;
import com.ratefood.app.entity.Restaurent;
import com.ratefood.app.repository.DishRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DishController {
    private DishRepository dishRepository;
    public DishController(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    @PostMapping("/dish")
    public ResponseEntity<Dish> addRestaurent(@RequestBody Dish dish) {
        dish.setId(1);
        Dish newDish = dishRepository.save(dish);
        return new ResponseEntity<>(newDish, HttpStatus.CREATED);
    }

}
