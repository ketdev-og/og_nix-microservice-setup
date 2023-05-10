package com.ogx.clientone.command.api.events;


import com.ogx.clientone.data.Product;
import com.ogx.clientone.repository.ProductRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class productsEventHandler {

    public productsEventHandler(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    private ProductRepository productRepository;

    @EventHandler
    public void on (ProductCreatedEvent event){
        Product product = new Product();
        BeanUtils.copyProperties(event, product);
        productRepository.save(product);
    }
}
