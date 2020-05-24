package com.stackscout.grocery.inventoryservice.controller;

import com.stackscout.grocery.inventoryservice.model.Item;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface IItemController
{
    @RequestMapping( method = RequestMethod.GET, path = "/items/{id}" )
    ResponseEntity<Item> getItemById( @PathVariable( "id" ) Integer Id );

    @RequestMapping( method = RequestMethod.POST, path = "/items" )
    ResponseEntity<Item> createItem( @RequestBody Item item );

    @RequestMapping( method = RequestMethod.GET, path = "/items" )
    ResponseEntity<Item> searchItem( @RequestParam( name = "id" ) Integer id );

}
