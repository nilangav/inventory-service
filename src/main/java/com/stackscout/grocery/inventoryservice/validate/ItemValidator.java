package com.stackscout.grocery.inventoryservice.validate;

import com.stackscout.grocery.inventoryservice.model.Item;
import lombok.SneakyThrows;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.client.HttpClientErrorException;

public class ItemValidator implements Validator
{
    @Override
    public boolean supports( Class<?> aClass )
    {
        return Item.class.equals( aClass );
    }

    @SneakyThrows
    @Override
    public void validate( Object o, Errors errors ) throws HttpClientErrorException.BadRequest
    {
        Item item = ( Item ) o;
        if( item.getManufacturedDate().after( item.getExpiryDate() ) )
        {
            throw new Exception("test msg");
        }
    }
}
