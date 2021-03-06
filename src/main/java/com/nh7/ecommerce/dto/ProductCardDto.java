package com.nh7.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductCardDto {
    //product
    private Long id;
    private String productThumbnail;
    private Double productPrice;
    //post
    private String postTitle;
    //shop
    private String address;
    //order
    private int soldQuantity;
}
