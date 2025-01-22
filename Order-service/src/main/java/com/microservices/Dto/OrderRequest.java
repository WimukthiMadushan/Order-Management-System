package com.microservices.Dto;

import java.math.BigDecimal;

public record OrderRequest(String OrderNumber, String skuCode, Integer quantity, BigDecimal price) {

}
