package main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import main.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
