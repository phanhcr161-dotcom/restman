package com.restman.demo.repository;

import com.restman.demo.entity.Order668; // Đảm bảo bạn đã có Entity Order668 tương ứng
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface OrderRepository668 extends JpaRepository<Order668, Long> {

    // Truy vấn dữ liệu chi tiết đơn hàng theo khoảng thời gian phục vụ thống kê
    @Query("SELECT o FROM Order668 o WHERE o.orderDate BETWEEN :startDate AND :endDate")
    List<Order668> findDetailsByPeriod(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate);

    // Tìm các đơn hàng chứa một món ăn cụ thể (phục vụ tính năng xem chi tiết)
    List<Order668> findByDishId(@Param("dishId") Long dishId);
}