package edu.icet.repository;

import edu.icet.entity.ItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<ItemsEntity,Integer> {


}
