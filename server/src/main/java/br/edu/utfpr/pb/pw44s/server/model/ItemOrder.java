package br.edu.utfpr.pb.pw44s.server.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_item_order")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class ItemOrder {

    // ItensDoPedido = {pedidoId: Long, produtoId: Long, preço: BigDecimal, quantidade: Integer}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal price;
    private Long quantity;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product")
    private Product product;
}
