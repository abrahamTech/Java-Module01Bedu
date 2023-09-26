package org.abraham.java.backend.Session08.persistence;

import org.abraham.java.backend.Session08.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long> {

}
