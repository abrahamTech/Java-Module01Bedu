package org.abrahamtech.Session04.service;

import java.util.LinkedList;
import java.util.List;

import org.abrahamtech.Session04.dto.CreateProductDTO;
import org.abrahamtech.Session04.dto.ProductDTO;
import org.abrahamtech.Session04.mapper.ProductMapper;
import org.abrahamtech.Session04.model.Product;
import org.abrahamtech.Session04.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    public List<ProductDTO> getAll() {
        List<Product> products = productRepository.getAll();

        List<ProductDTO> data = new LinkedList<>();
        
        for(Product product : products) {
            data.add(productMapper.toDTO(product));
        }

        return data;

        //SENIOR Version
        // return products.stream().map(x -> toDTO(x)).toList();
    }

    public ProductDTO save(CreateProductDTO data) {
        Product model = productMapper.toModel(data);
        return productMapper.toDTO(productRepository.save(model));
    }

    /* 
    These methods is now in ProductMapper file
    
    public Product toModel(CreateProductDTO dto) {
        return new Product(0, dto.getName(), dto.getStock(), dto.getPrice());
    }

    private Product toModel(ProductDTO dto) {
        return new Product(dto.getId(), dto.getName(), dto.getQuantity(), dto.getPrice());
    }


    private ProductDTO toDTO(Product model) {
        return new ProductDTO(model.getId(), model.getName(), model.getQuantity(), model.getPrice());
    }*/
}
