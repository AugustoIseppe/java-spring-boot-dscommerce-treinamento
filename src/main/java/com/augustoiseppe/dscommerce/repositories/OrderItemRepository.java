package com.augustoiseppe.dscommerce.repositories;

import com.augustoiseppe.dscommerce.entities.Order;
import com.augustoiseppe.dscommerce.entities.OrderItem;
import com.augustoiseppe.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
