package br.edu.utfpr.pb.pw44s.server.dto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.List;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class OrderDTO {

    private LocalDate orderDate;
    private List<ProductOrderDTO> products;
}
