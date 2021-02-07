package com.sda.invoices.web.rest;

import com.sda.invoices.domain.products.Product;
import com.sda.invoices.domain.products.ProductService;
import com.sda.invoices.web.dto.ProductDto;
import com.sda.invoices.web.mappers.ProductMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductRestController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDto> create(@RequestBody ProductDto dto){
        Product product = ProductMapper.INSTANCE.toEntity(dto);

        ProductDto savedDto = ProductMapper.INSTANCE.toDto(productService.save(product));
        return ResponseEntity.ok(savedDto);

    }




}
