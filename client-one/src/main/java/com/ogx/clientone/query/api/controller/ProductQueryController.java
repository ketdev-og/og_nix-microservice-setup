package com.ogx.clientone.query.api.controller;


import com.ogx.clientone.command.api.model.ProductRestModule;
import com.ogx.clientone.query.api.queries.GetProductQueries;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductQueryController {

    public ProductQueryController(QueryGateway queryGateway) {
        this.queryGateway = queryGateway;
    }

    private final QueryGateway queryGateway;


    @GetMapping
    public List<ProductRestModule> getProducts() {
        GetProductQueries getProductQueries = new GetProductQueries();
        return queryGateway.
                query(getProductQueries,
                        ResponseTypes.multipleInstancesOf(ProductRestModule.class))
                .join();
    }
}
