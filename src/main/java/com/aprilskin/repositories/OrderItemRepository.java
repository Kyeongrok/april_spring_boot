package com.aprilskin.repositories;

import com.aprilskin.entities.OrderItem;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Kyeongrok on 2017-08-01.
 */

@Repository("orderRepository")
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
