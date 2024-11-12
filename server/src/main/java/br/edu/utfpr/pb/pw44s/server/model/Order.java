package br.edu.utfpr.pb.pw44s.server.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;



@Entity
@Table(name = "tb_order")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter @Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @Column(name = "order_description")
    private String orderDescription;

    @OneToMany(mappedBy = "order")
    private List<OrderItens> orderItems;


}

