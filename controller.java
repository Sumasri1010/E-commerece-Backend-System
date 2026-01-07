package com.example.ecommerce.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.ecommerce.model.Product;
import com.example.ecommerce.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return service.addProduct(product);
    }

    @GetMapping
    public List<Product> getProducts() {
        return service.getAllProducts();
    }
}

package com.example.ecommerce.controller;

import org.springframework.web.bind.annotation.*;
import com.example.ecommerce.model.Cart;
import com.example.ecommerce.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartService service;

    public CartController(CartService service) {
        this.service = service;
    }

    @PostMapping
    public Cart addToCart(@RequestBody Cart cart) {
        return service.addToCart(cart);
    }
}

package com.example.ecommerce.controller;

import org.springframework.web.bind.annotation.*;
import com.example.ecommerce.model.OrderEntity;
import com.example.ecommerce.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public OrderEntity placeOrder(@RequestBody OrderEntity order) {
        return service.placeOrder(order);
    }
}