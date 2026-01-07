package com.example.ecommerce.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product addProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }
}

package com.example.ecommerce.service;

import org.springframework.stereotype.Service;
import com.example.ecommerce.repository.CartRepository;
import com.example.ecommerce.model.Cart;

@Service
public class CartService {

    private final CartRepository repository;

    public CartService(CartRepository repository) {
        this.repository = repository;
    }

    public Cart addToCart(Cart cart) {
        return repository.save(cart);
    }
}

package com.example.ecommerce.service;

import org.springframework.stereotype.Service;
import com.example.ecommerce.repository.OrderRepository;
import com.example.ecommerce.model.OrderEntity;

@Service
public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public OrderEntity placeOrder(OrderEntity order) {
        order.setStatus("ORDER_PLACED");
        return repository.save(order);
    }
}