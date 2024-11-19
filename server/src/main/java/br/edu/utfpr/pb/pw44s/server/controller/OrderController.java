//package br.edu.utfpr.pb.pw44s.server.controller;
//
//import br.edu.utfpr.pb.pw44s.server.dto.OrderDTO;
//import br.edu.utfpr.pb.pw44s.server.model.Order;
//import br.edu.utfpr.pb.pw44s.server.services.ICrudService;
//import br.edu.utfpr.pb.pw44s.server.services.IOrderService;
//import org.springframework.web.bind.annotation.*;
//import org.modelmapper.ModelMapper;
//
//@RestController
//@RequestMapping("orders")
//public class OrderController extends CrudController<Order, OrderDTO, Long>{ // Metodo pra salvar e lista tirar Crud.
//
//
//    private final IOrderService orderService;
//    private final ModelMapper modelMapper;
//
//    public OrderController(Class<Order> typeClass, Class<OrderDTO> typeDtoClass, IOrderService orderService, ModelMapper modelMapper) {
//        super(typeClass, typeDtoClass);
//        this.orderService = orderService;
//        this.modelMapper = modelMapper;
//    }
//
//    @Override
//    protected ICrudService<Order, Long> getService() {
//        return orderService;
//    }
//
//    @Override
//    protected ModelMapper getModelMapper() {
//        return modelMapper;
//    }
//}
