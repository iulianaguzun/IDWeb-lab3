package com.iuliana.products.service.impl;

import com.iuliana.products.models.entity.Product;
import com.iuliana.products.models.responses.ProductResponseDTO;
import com.iuliana.products.repository.ProductRepository;
import com.iuliana.products.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    public List<ProductResponseDTO> getAllProducts() {
        List<Product> productList = productRepository.findAll();
        return productList.stream()
                .map(this::createResponseDTO)
                .toList();
    }

    private ProductResponseDTO createResponseDTO(Product product){
        return ProductResponseDTO.builder()
                .name(product.getName())
                .manufacture(product.getManufacture().getManufacture())
                .type(product.getType().getType())
                .price(product.getPrice())
                .build();
    }
}
