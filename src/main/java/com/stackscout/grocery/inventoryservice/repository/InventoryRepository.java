package com.stackscout.grocery.inventoryservice.repository;

import com.stackscout.grocery.inventoryservice.model.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepository extends MongoRepository<Inventory, Integer>
{
}
