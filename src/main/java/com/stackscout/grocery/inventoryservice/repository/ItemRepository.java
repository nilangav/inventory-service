package com.stackscout.grocery.inventoryservice.repository;

import com.stackscout.grocery.inventoryservice.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<Item, Integer>
{
}
