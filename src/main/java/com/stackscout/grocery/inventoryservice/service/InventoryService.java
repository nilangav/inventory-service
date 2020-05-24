package com.stackscout.grocery.inventoryservice.service;

import com.stackscout.grocery.inventoryservice.model.Inventory;
import com.stackscout.grocery.inventoryservice.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import response.ResponsePack;

@Service
public class InventoryService
{
    @Autowired
    private InventoryRepository inventoryRepository;

    public ResponsePack<Inventory> getInventoryById( Integer id )
    {
        return new ResponsePack<>( inventoryRepository.findById( id ) );
    }

    public ResponsePack<Inventory> createInventory( Inventory inventory )
    {
        return new ResponsePack<>( inventoryRepository.save( inventory ) );
    }
}
