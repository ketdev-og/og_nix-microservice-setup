package com.ogx.clientone.command.api.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;


@Data
@Builder
public class ProductRestModule {
    private String name;
    private BigDecimal price;
    private Integer quantity;
}
