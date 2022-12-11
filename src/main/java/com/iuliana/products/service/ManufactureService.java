package com.iuliana.products.service;

import com.iuliana.products.models.responses.ManufactureResponseDTO;

import java.util.List;

public interface ManufactureService {

    List<ManufactureResponseDTO> getAllManufactures();
}
