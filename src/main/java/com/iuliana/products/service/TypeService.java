package com.iuliana.products.service;

import com.iuliana.products.models.responses.TypeResponseDTO;

import java.util.List;

public interface TypeService {

    List<TypeResponseDTO> getAllTypes();
}
