package net.proselyte.jwtappdemo.repository;

import net.proselyte.jwtappdemo.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<Item, Long> {
  //  Item findById(Long id);
}
