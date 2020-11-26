package lol.vecmty.jwtappdemo.repository;

import lol.vecmty.jwtappdemo.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<Item, Long> {
  //  Item findById(Long id);
}
