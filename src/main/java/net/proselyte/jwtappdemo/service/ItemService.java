package net.proselyte.jwtappdemo.service;


import net.proselyte.jwtappdemo.model.Item;

import java.util.List;

public interface ItemService {
    Item add (Item item);

    List<Item> getAll();

    Item findById(Long id);

    void delete(Long id);
}
