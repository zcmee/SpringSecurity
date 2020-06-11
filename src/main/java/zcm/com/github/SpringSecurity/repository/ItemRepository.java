package zcm.com.github.SpringSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zcm.com.github.SpringSecurity.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
