package com.stackscout.grocery.inventoryservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Document( collection = "item" )
public class Item
{
    @Id
    @JsonProperty
    private Integer id;

    @JsonProperty
    private String genericName;

    @JsonProperty
    private String brandName;

    @JsonProperty
    private String unitDescription;

    @JsonProperty
    private Double unitPrice;

    @JsonProperty
    private Date manufacturedDate;

    @JsonProperty
    private Date expiryDate;
}
