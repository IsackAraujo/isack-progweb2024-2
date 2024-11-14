package br.edu.utfpr.pb.pw44s.server.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDto {

    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    private BigDecimal price;

    @NotNull
    private String image;

}
