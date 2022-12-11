package com.iuliana.products.service.impl;

import com.iuliana.products.models.entity.Manufacture;
import com.iuliana.products.models.responses.ManufactureResponseDTO;
import com.iuliana.products.repository.ManufactureRepository;
import com.iuliana.products.service.ManufactureService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ManufactureServiceImpl implements ManufactureService {

    private ManufactureRepository manufactureRepository;

    @Override
    public List<ManufactureResponseDTO> getAllManufactures() {
        List<Manufacture> manufactures = manufactureRepository.findAll();
        return manufactures.stream()
                .map(this::createManufactureDto)
                .toList();
    }

    private ManufactureResponseDTO createManufactureDto(Manufacture manufacture){
        return ManufactureResponseDTO.builder()
                .name(manufacture.getManufacture())
                .build();
    }
}
