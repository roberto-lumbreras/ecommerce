package org.factoriaf5.ecommerce.repository;

import org.factoriaf5.ecommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
    
}
