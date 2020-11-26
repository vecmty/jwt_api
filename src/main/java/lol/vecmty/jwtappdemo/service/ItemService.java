package lol.vecmty.jwtappdemo.service;


import lol.vecmty.jwtappdemo.model.Item;

import java.util.List;

public interface ItemService {
    Item add (Item item);

    List<Item> getAll();

    Item findById(Long id);

    void delete(Long id);
}
