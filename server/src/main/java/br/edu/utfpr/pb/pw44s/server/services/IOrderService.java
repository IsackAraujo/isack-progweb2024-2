package br.edu.utfpr.pb.pw44s.server.services;

import br.edu.utfpr.pb.pw44s.server.model.Order;
import org.springframework.data.domain.jaxb.SpringDataJaxb;

public interface IOrderService extends ICrudService<Order, Long> {
}
