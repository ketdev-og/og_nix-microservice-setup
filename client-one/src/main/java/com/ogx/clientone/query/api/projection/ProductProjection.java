package com.ogx.clientone.query.api.projection;


import com.ogx.clientone.command.api.model.ProductRestModule;
import com.ogx.clientone.data.Product;
import com.ogx.clientone.query.api.queries.GetProductQueries;
import com.ogx.clientone.repository.ProductRepository;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductProjection {



    ProductRepository productRepository;
    public ProductProjection(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @QueryHandler
    public List<ProductRestModule> handle(GetProductQueries getProductQueries){
        return productRepository.findAll()
                .stream().map(x ->
                        ProductRestModule.builder()
                                .quantity(x.getQuantity())
                                .price(x.getPrice())
                                .name(x.getName())
                                .build()
                ).toList();
    }

}