package com.stackscout.grocery.inventoryservice.service;

import com.stackscout.grocery.inventoryservice.model.Item;
import com.stackscout.grocery.inventoryservice.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import response.ResponsePack;

@Service
public class ItemService
{
    @Autowired
    private ItemRepository itemRepository;

    public ResponsePack<Item> getItemById( Integer id )
    {
        return new ResponsePack<>( itemRepository.findById( id ) );
    }

    public ResponsePack<Item> createItem( Item item )
    {
        return new ResponsePack<>( itemRepository.save( item ) );
    }

    public ResponsePack<Item> searchItem( Integer id )
    {
        return new ResponsePack<>( itemRepository.findById( id ) );
    }
}
