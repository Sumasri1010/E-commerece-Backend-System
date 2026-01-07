package com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

package com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecommerce.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
}

package com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecommerce.model.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}

package com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecommerce.model.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}