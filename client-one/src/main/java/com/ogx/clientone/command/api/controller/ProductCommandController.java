package com.ogx.clientone.command.api.controller;


import com.ogx.clientone.command.api.commands.CreateProductCommand;
import com.ogx.clientone.command.api.model.ProductRestModule;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductCommandController {

    private CommandGateway commandGateway;

    public ProductCommandController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping
    public String addproducts(@RequestBody ProductRestModule product){

        CreateProductCommand createProductCommand = CreateProductCommand.builder()
                .productId(UUID.randomUUID().toString())
                .name(product.getName())
                .price(product.getPrice())
                .quantity(product.getQuantity())
                .build();

        return commandGateway.sendAndWait(createProductCommand);
    }
}
