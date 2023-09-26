package org.abraham.java.backend.Session08.controllers;

import org.abraham.java.backend.Session08.persistence.ProductRepository;
import org.abraham.java.backend.Session08.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public ResponseEntity<Void> createProduct(@RequestBody Products product) {

        Products productDB = productRepository.save(product);

        return ResponseEntity.created(URI.create(String.valueOf(product.getId()))).build();
    }

    @GetMapping("/{productoId}")
    public ResponseEntity<Products> getProduct(@PathVariable Long productId) {

        Optional<Products> productDB = productRepository.findById(productId);

        if (!productDB.isPresent())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The specified product does not exist.");

        return ResponseEntity.ok(productDB.get());
    }
}
