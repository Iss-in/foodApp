package com.ratefood.app.controller;

import com.ratefood.app.entity.Restaurent;
import com.ratefood.app.repository.RestaurentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestaurentController {

    private RestaurentRepository restaurentRepository;

    public RestaurentController(RestaurentRepository restaurentRepository) {
        this.restaurentRepository = restaurentRepository;
    }

    @PostMapping("/restaurent")
    public ResponseEntity<Restaurent> addRestaurent(@RequestBody Restaurent restaurent) {
        restaurent.setId(1);
        Restaurent newRestaurent = restaurentRepository.save(restaurent);
        return new ResponseEntity<>(newRestaurent, HttpStatus.CREATED);
    }

}
