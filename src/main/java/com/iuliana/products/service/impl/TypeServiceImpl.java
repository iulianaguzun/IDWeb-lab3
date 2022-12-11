package com.iuliana.products.service.impl;

import com.iuliana.products.models.entity.Type;
import com.iuliana.products.models.responses.TypeResponseDTO;
import com.iuliana.products.repository.TypeRepository;
import com.iuliana.products.service.TypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TypeServiceImpl implements TypeService {

    private TypeRepository typeRepository;

    @Override
    public List<TypeResponseDTO> getAllTypes() {
        List<Type> types = typeRepository.findAll();
        return types.stream()
                .map(this::createTypeResponse)
                .toList();
    }

    private TypeResponseDTO createTypeResponse(Type type) {
        return TypeResponseDTO.builder()
                .type(type.getType())
                .build();
    }
}
