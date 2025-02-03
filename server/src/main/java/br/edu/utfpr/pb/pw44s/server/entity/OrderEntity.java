package br.edu.utfpr.pb.pw44s.server.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_product")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity productEntityId;
    private Long quantity;
    private BigDecimal totalValue;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntityId;
    private LocalDateTime orderDate;
}
