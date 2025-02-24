package edu.icet.service;


import edu.icet.dto.Items;

import java.util.List;

public interface ItemService {
    void addItems(Items items);

    List<Items> getAll();

    List<Items> deleteByItemCode(String itemCode);
}

