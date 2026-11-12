package com.restman.demo.controller;

import com.restman.demo.dto.RevenueRow668;
import com.restman.demo.entity.Order668;
import com.restman.demo.service.RevenueService668;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/revenue668")
public class RevenueController668 {

    @Autowired
    private RevenueService668 revenueService668;

    // API lấy thống kê doanh thu món ăn theo khoảng thời gian
    @GetMapping("/dishes")
    public ResponseEntity<List<RevenueRow668>> getDishRevenue(
            @RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
            @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate) {
        
        // Validate khoảng thời gian
        if (startDate.isAfter(endDate)) {
            return ResponseEntity.badRequest().build();
        }

        List<RevenueRow668> report = revenueService668.calculateDishRevenue(startDate, endDate);
        return ResponseEntity.ok(report);
    }

    // API xem danh sách đơn gọi món của một món ăn cụ thể
    @GetMapping("/dish/{dishId}/orders")
    public ResponseEntity<List<Order668>> getDishOrders(@PathVariable("dishId") Long dishId) {
        List<Order668> orders = revenueService668.getOrdersForDish(dishId);
        return ResponseEntity.ok(orders);
    }
}