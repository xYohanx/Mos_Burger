package edu.icet.repository;

import edu.icet.entity.CustomerDetailsEntity;
import edu.icet.entity.ItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDetailsRepository extends JpaRepository<CustomerDetailsEntity,Integer> {
}
