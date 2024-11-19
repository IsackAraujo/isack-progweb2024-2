package br.edu.utfpr.pb.pw44s.server.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Getter
@Setter
public class ItemOrderDTO {

    private int id;

    private BigDecimal price;

    @NotNull
    private int quantity;

    @NotNull
    private ProductDTO product;

}
