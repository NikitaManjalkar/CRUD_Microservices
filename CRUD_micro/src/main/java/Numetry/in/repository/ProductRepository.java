package Numetry.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Numetry.in.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

