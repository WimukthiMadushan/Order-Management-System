package com.microservices.product_service.Dto;

import lombok.Builder;

import java.math.BigDecimal;

public record ProductRequest(String id, String name, String description, BigDecimal price) {
}
