package edu.icet.service.impl;

import edu.icet.dto.Items;
import edu.icet.entity.ItemsEntity;
import edu.icet.repository.ItemRepository;
import edu.icet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    final ItemRepository itemRepository;

    final ModelMapper mapper;

    @Override
    public void addItems(Items items) {
        itemRepository.save(mapper.map(items, ItemsEntity.class));
    }

    @Override
    public List<Items> getAll() {
        List<Items> itemsList = new ArrayList<>();
        List<ItemsEntity> all = itemRepository.findAll();

        all.forEach(customerEntity ->
                itemsList.add(mapper.map(customerEntity, Items.class)));

        return itemsList;

    }

    @Override
    public List<Items> deleteByItemCode(String itemCode) {
        List<Items> itemsList = new ArrayList<>();
        List<ItemsEntity> byItemCode = itemRepository.deleteByItemCode(itemCode);

       byItemCode.forEach(itemsEntity ->
               itemsList.add(mapper.map(itemsEntity , Items.class))
       );

        return itemsList;
    }
}
