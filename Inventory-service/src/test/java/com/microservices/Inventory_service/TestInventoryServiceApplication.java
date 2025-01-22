package com.microservices.Inventory_service;

import org.springframework.boot.SpringApplication;

import com.microservices.InventoryServiceApplication;

public class TestInventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(InventoryServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
