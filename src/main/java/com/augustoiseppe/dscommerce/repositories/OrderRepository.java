package com.augustoiseppe.dscommerce.repositories;

import com.augustoiseppe.dscommerce.entities.Order;
import com.augustoiseppe.dscommerce.entities.User;
import com.augustoiseppe.dscommerce.projections.UserDetailsProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {

    }
