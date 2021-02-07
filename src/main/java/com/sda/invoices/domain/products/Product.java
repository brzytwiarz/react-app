package com.sda.invoices.domain.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue
            (strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String description;
    private BigDecimal priceNetto;
    @Enumerated(EnumType.STRING)
    private Vat vat;



   public enum Vat {

        VAT_8(8), VAT_23(23);

        Vat(int value) {
            this.value = value;
        }

        int value;

        public int getValue() {
            return value;
        }

    }


}
