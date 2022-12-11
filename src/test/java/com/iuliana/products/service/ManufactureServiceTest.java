package com.iuliana.products.service;

import com.iuliana.products.repository.ManufactureRepository;
import com.iuliana.products.service.impl.ManufactureServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;

@ExtendWith(MockitoExtension.class)
class ManufactureServiceTest {

    @MockBean
    private ManufactureRepository manufactureRepository;

    @InjectMocks
    private ManufactureServiceImpl manufactureService;

    @Test
    void getAllManufactures() {
    }

    @Test
    void getAllManufacturesById() {
    }
}