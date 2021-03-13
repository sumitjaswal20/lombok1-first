package com.example.lombok1.Repository;

import com.example.lombok1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Productrepo extends JpaRepository<Product,Integer> {
}
