package lol.vecmty.jwtappdemo.rest;


import lol.vecmty.jwtappdemo.dto.ItemDto;
import lol.vecmty.jwtappdemo.model.Item;
import lol.vecmty.jwtappdemo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }




//////////////////////////////////////////////////////////////////////




    @PostMapping
    public void add(@RequestBody Item item) {
        itemService.add(item);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ItemDto> delete(@PathVariable Long id) {
        Item item = itemService.findById(id);
        if (item == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        itemService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public List<Item> getAll() {
        return itemService.getAll();
    }


    @GetMapping("/{id}")
    public ResponseEntity<ItemDto> findById(@PathVariable(value = "id") Long id) {
        Item item = itemService.findById(id);

        if (item == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        ItemDto result = ItemDto.fromItem(item);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
