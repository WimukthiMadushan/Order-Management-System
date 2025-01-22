package com.microservices.Order_service;

import org.springframework.stereotype.Service;

import com.microservices.Dto.OrderRequest;
import com.microservices.Model.Order;
import com.microservices.Repository.OrderRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest OrderRequest) {
        // create new order
        Order order = new Order();
        order.setOrderNumber(OrderRequest.OrderNumber());
        order.setSkuCode(OrderRequest.skuCode());
        order.setPrice(OrderRequest.price());
        order.setQuantity(OrderRequest.quantity());
        // save in the repository
        orderRepository.save(order);

    }

}
