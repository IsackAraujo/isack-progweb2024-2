package br.edu.utfpr.pb.pw44s.server.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Primary;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_order")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class OrderItens {

    // ItensDoPedido = {pedidoId: Long, produtoId: Long, preço: BigDecimal, quantidade: Integer}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private Long productId;
    private BigDecimal price;
    private Long quantity;




    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
