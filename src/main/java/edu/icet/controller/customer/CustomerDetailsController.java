package edu.icet.controller.customer;

import edu.icet.dto.Customer;
import edu.icet.dto.Items;
import edu.icet.service.CustomerDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer-add")
@RequiredArgsConstructor
@CrossOrigin
public class CustomerDetailsController {
  final   CustomerDetailsService customerDetailsService;


    @PostMapping("/add")
    public void addCustomer(@RequestBody Customer customer){
        customerDetailsService.addCustomer(customer);
    }
    @GetMapping("/get-all")
    public List<Customer> getAll(){
        return customerDetailsService.getAll();
    }
}
