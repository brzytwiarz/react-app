package com.sda.invoices.web.dto;

import com.sda.invoices.domain.products.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
public class ProductDto {

    private Long id;
    private String name;
    private String description;
    private BigDecimal priceNetto;
    private Product.Vat vat;



}
