package com.microservices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.Model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
