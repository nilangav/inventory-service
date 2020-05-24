package com.stackscout.grocery.inventoryservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document( collection = "inventory" )
public class Inventory
{
    @JsonProperty
    @Id
    private Integer id;

    @JsonProperty
    private Integer vendorId;

    @JsonProperty
    private Integer itemId;

    @JsonProperty
    private Integer quantity;
}
