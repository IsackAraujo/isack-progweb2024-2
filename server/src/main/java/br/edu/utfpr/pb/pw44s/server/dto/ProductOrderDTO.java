package br.edu.utfpr.pb.pw44s.server.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Getter
@Setter
public class ProductOrderDTO {

    private int id;

    @NotNull
    private int quantity;

    private BigDecimal totalValue;

}
