package edu.icet.service;

import edu.icet.dto.Order;

import java.util.List;

public interface OrderService {
    void addPlaceOrder(Order order);

    List<Order> getAll();

}
