package com.aprilskin.repositories;

import com.aprilskin.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Kyeongrok on 2017-08-01.
 */

@Repository("orderRepository")
public interface OrderRepository extends JpaRepository<Order, Long> {

}
