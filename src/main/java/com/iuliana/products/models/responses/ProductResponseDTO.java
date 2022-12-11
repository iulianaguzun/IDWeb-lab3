package com.iuliana.products.models.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class ProductResponseDTO {

    private String name;

    private String manufacture;

    private String type;

    private double price;

}
