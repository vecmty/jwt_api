package net.proselyte.jwtappdemo.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import net.proselyte.jwtappdemo.model.Item;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemDto {

    private Long id;
    private String name;

    public Item toItem(){
        Item item = new Item();
        item.setId(id);
        item.setName(name);

        return item;
    }


    public static ItemDto fromItem(Item item) {
        ItemDto itemDto = new ItemDto();
        itemDto.setId(item.getId());
        itemDto.setName(item.getName());

        return itemDto;
    }
}
