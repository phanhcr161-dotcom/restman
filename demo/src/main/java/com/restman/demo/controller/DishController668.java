package com.restman.demo.controller;

import com.restman.demo.entity.Dish668;
import com.restman.demo.service.DishService668;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dishes668")
public class DishController668 {

    @Autowired
    private DishService668 dishService668;

    // API Tìm kiếm món ăn
    @GetMapping("/search")
    public ResponseEntity<List<Dish668>> searchDish(@RequestParam("keyword") String keyword) {
        List<Dish668> dishes = dishService668.searchDish(keyword);
        return ResponseEntity.ok(dishes);
    }

    // API Xem chi tiết món ăn
    @GetMapping("/{id}")
    public ResponseEntity<Dish668> getDishDetail(@PathVariable("id") Long id) {
        return dishService668.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}