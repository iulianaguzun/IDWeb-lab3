package com.iuliana.products.service;

import com.iuliana.products.repository.TypeRepository;
import com.iuliana.products.service.impl.TypeServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;

@ExtendWith(MockitoExtension.class)
class TypeServiceTest {

    @MockBean
    private TypeRepository typeRepository;

    @InjectMocks
    private TypeServiceImpl typeService;

    @Test
    void getAllTypes() {
    }

    @Test
    void getAllTypesById() {
    }
}