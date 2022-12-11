package com.iuliana.products.controller;

import com.iuliana.products.models.responses.TypeResponseDTO;
import com.iuliana.products.service.TypeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/type")
@AllArgsConstructor
public class TypeController {
    private TypeService typeService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TypeResponseDTO> getAllTypes(){
        return typeService.getAllTypes();
    }
}
