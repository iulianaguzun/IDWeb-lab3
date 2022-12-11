package com.iuliana.products.controller;

import com.iuliana.products.service.ManufactureService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
class ManufactureControllerTest {

    private MockMvc mockMvc;

    @MockBean
    private ManufactureService manufactureService;

    @InjectMocks
    private ManufactureController manufactureController;

    @Test
    void getAllManufactures() {

    }

    @Test
    void getAllManufacturesById() {

    }
}