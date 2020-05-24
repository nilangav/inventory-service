package com.stackscout.grocery.inventoryservice.controller.impl;

import com.stackscout.grocery.inventoryservice.controller.IItemController;
import com.stackscout.grocery.inventoryservice.model.Item;
import com.stackscout.grocery.inventoryservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import response.ResponseUtils;

@RestController
public class ItemController implements IItemController
{
    @Autowired
    private ItemService itemService;

    @Override
    public ResponseEntity<Item> getItemById( Integer id )
    {
        return ResponseUtils.wrap( itemService.getItemById( id ) );
    }

    @Override
    public ResponseEntity<Item> createItem( Item item )
    {
        return ResponseUtils.wrap( itemService.createItem( item ) );
    }

    @Override
    public ResponseEntity<Item> searchItem( Integer id )
    {
        return ResponseUtils.wrap( itemService.searchItem( id ) );
    }
}
