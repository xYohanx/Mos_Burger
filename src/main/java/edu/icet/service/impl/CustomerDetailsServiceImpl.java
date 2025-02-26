package edu.icet.service.impl;

import edu.icet.dto.Customer;
import edu.icet.entity.CustomerDetailsEntity;
import edu.icet.repository.CustomerDetailsRepository;
import edu.icet.service.CustomerDetailsService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerDetailsServiceImpl implements CustomerDetailsService {
   final CustomerDetailsRepository customerDetailsRepository;
   final ModelMapper mapper;

    @Override
    public void addCustomer(Customer customer) {
        customerDetailsRepository.save(mapper.map(customer, CustomerDetailsEntity.class));
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customerEntities= new ArrayList<>();
        List<CustomerDetailsEntity> all = customerDetailsRepository.findAll();

        all.forEach(customerDetailsEntity ->
                customerEntities.add(mapper.map(customerDetailsEntity, Customer.class))
        );

        return customerEntities;
    }
}
