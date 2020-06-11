package zcm.com.github.SpringSecurity.service.impl;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import zcm.com.github.SpringSecurity.ItemService;
import zcm.com.github.SpringSecurity.entity.Item;
import zcm.com.github.SpringSecurity.repository.ItemRepository;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }
}
