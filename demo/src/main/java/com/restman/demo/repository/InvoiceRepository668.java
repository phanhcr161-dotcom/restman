package com.restman.demo.repository;

import com.restman.demo.entity.Invoice668; // Đảm bảo bạn đã có Entity Invoice668 tương ứng
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository668 extends JpaRepository<Invoice668, Long> {
    // Có thể bổ sung các truy vấn hóa đơn liên quan nếu cần
}