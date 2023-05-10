package com.ogx.clientone.command.api.aggregates;


import com.ogx.clientone.command.api.commands.CreateProductCommand;
import com.ogx.clientone.command.api.events.ProductCreatedEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

@Aggregate
public class productAggregates {
    @AggregateIdentifier
    private String productId;
    private String name;
    private BigDecimal price;
    private Integer quantity;


    @CommandHandler
    public productAggregates(CreateProductCommand createProductCommand) {
        ProductCreatedEvent productCreatedEvent =  new ProductCreatedEvent();
        BeanUtils.copyProperties(createProductCommand, productCreatedEvent);
        AggregateLifecycle.apply(productCreatedEvent);
    }

    public productAggregates() {
    }

    /* reset the aggregates values after event has taken place
    * whenever product event is completed then it runs the below method
    * */

    @EventSourcingHandler
    public void on(ProductCreatedEvent productCreatedEvent){
        System.err.println(productCreatedEvent);
        this.name = productCreatedEvent.getName();
        this.price= productCreatedEvent.getPrice();
        this.productId = productCreatedEvent.getProductId();
        this.quantity= productCreatedEvent.getQuantity();
    }
}
