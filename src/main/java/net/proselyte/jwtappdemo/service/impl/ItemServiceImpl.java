package net.proselyte.jwtappdemo.service.impl;

import net.proselyte.jwtappdemo.model.Item;
import net.proselyte.jwtappdemo.repository.ItemRepository;
import net.proselyte.jwtappdemo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    private final BCryptPasswordEncoder passwordEncoder;
    private final ItemRepository itemRepository;

    @Autowired
    public ItemServiceImpl(BCryptPasswordEncoder passwordEncoder, ItemRepository itemRepository) {
        this.passwordEncoder = passwordEncoder;
        this.itemRepository = itemRepository;
    }


    @Override
    public Item add(Item item) {
        itemRepository.save(item);
        // log.info("IN register - user: {} successfully registered", registeredUser);
        return item;
    }



    @Override
    public List<Item> getAll() {
        List<Item> result = itemRepository.findAll();
       // log.info("IN getAll - {} users found", result.size());
        return result;
    }


    @Override
    public Item findById(Long id) {
        Item result = itemRepository.findById(id).orElse(null);
        if (result == null){
            // log.warn("IN findById - no user found by id: {}", id);
            return null;
        }
        //log.info("IN findById - user: {} found by id: {}", result);
        return result;
    }



    @Override
    public void delete(Long id) {
        itemRepository.deleteById(id);
        //log.info("IN delete - user with id: {} successfully deleted");
    }


}
