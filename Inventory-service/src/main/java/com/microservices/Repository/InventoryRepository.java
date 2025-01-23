package com.microservices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.Model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    boolean existsBySkuCodeAndQuantityGreaterThanEqual(String skuCode, Integer quantity);

}
