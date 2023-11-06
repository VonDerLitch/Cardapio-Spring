package com.project.Cardapio.controller;

import com.project.Cardapio.food.Food;
import com.project.Cardapio.food.FoodRepository;
import com.project.Cardapio.food.FoodResponseDTO;
import com.project.Cardapio.food.FoodRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping //POST
    public void saveFood(@RequestBody FoodRequestDTO data){

        Food foodData = new Food(data);
        repository.save(foodData);
        return;
    }
    @GetMapping // SHOW ALL nas TABLES
    public List<FoodResponseDTO> getALL(){
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }
}

