package me.zhl.fanli.repository;

import me.zhl.fanli.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
