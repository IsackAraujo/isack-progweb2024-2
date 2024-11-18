package br.edu.utfpr.pb.pw44s.server.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class OrderDTO {

    private int id;

    @NotNull
    private int userId;

    @NotNull
    private int productId;

    @NotNull
    private int quantity;
}
