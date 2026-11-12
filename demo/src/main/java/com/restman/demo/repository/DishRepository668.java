package com.restman.demo.repository;

import com.restman.demo.entity.Dish668;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishRepository668 extends JpaRepository<Dish668, Long> {

    // Phương thức tìm kiếm món ăn theo tên (phục vụ chức năng tìm kiếm)
    List<Dish668> findByNameContainingIgnoreCase(String name);
}