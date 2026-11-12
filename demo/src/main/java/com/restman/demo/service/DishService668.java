package com.restman.demo.service; // Giữ nguyên dòng package có sẵn

// Dán các thư viện import ở đây
import com.restman.demo.entity.Dish668;
import com.restman.demo.repository.DishRepository668;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DishService668 { // Dán toàn bộ nội dung bên trong này

    @Autowired
    private DishRepository668 dishRepository668;

    public List<Dish668> searchDish(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return dishRepository668.findAll();
        }
        return dishRepository668.findByNameContainingIgnoreCase(keyword);
    }

    public Optional<Dish668> findById(Long id) {
        return dishRepository668.findById(id);
    }
}

