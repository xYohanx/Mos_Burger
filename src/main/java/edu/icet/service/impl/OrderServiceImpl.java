package edu.icet.service.impl;

import edu.icet.dto.Order;
import edu.icet.entity.OrderEntity;
import edu.icet.repository.OrderRepository;
import edu.icet.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    final OrderRepository orderRepository;
    final ModelMapper mapper;

    @Override
    public void addPlaceOrder(Order order) {
        orderRepository.save(mapper.map(order, OrderEntity.class));
    }

    @Override
    public List<Order> getAll() {
        List<Order> orderList = new ArrayList<>();
        List<OrderEntity> all = orderRepository.findAll();

        all.forEach(orderEntity ->
                orderList.add(mapper.map(orderEntity, Order.class))
                );

        return orderList;
    }
}
