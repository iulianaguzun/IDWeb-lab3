package com.iuliana.products.controller;

import com.iuliana.products.models.responses.ManufactureResponseDTO;
import com.iuliana.products.service.ManufactureService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/manufacture")
@AllArgsConstructor
public class ManufactureController {
    private ManufactureService manufactureService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ManufactureResponseDTO> getAllManufactures(){
        return manufactureService.getAllManufactures();
    }
}
