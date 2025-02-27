package edu.icet.controller.order;

import edu.icet.dto.Order;
import edu.icet.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/place-order")
@RequiredArgsConstructor
@CrossOrigin
public class OrderController {

    final OrderService orderService;

    @PostMapping("/add")
    public void addPlaceOrder(@RequestBody Order order){
        orderService.addPlaceOrder(order);
    }
    @GetMapping("/get-all")
    public List<Order> getAll(){
      return orderService.getAll();
    }
}
