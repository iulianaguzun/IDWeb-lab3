package com.iuliana.products.service;

import com.iuliana.products.models.responses.ProductResponseDTO;

import java.util.List;

public interface ProductService {
    List<ProductResponseDTO> getAllProducts();
}
