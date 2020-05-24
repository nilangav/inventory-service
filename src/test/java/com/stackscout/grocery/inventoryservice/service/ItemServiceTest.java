package com.stackscout.grocery.inventoryservice.service;

import com.stackscout.grocery.inventoryservice.model.Item;
import com.stackscout.grocery.inventoryservice.repository.ItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import response.ResponsePack;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith( SpringRunner.class )
@ContextConfiguration( classes = { ItemService.class } )
public class ItemServiceTest
{
    @Autowired
    private ItemService itemService;
    @MockBean
    private ItemRepository itemRepository;

    @Test
    public void item_get_test()
    {
        Item mockItem = new Item( 1, "Milk", "Anchor", "400g", 345.0, new Date(), new Date() );
        Mockito.when( itemRepository.findById( 1 ) ).thenReturn( java.util.Optional.of( mockItem ) );

        ResponsePack<Item> item = itemService.getItemById( 1 );

        assertThat( item.getEntity().getBrandName() ).isEqualTo( mockItem.getBrandName() );
    }
}
