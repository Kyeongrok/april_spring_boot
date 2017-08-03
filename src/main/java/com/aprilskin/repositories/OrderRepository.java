package com.aprilskin.repositories;

import com.aprilskin.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Kyeongrok on 2017-08-01.
 */
public interface OrderRepository extends JpaRepository<OrderItem, Long> {
}
