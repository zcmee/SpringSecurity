package zcm.com.github.SpringSecurity.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zcm.com.github.SpringSecurity.ItemService;
import zcm.com.github.SpringSecurity.entity.Item;

import java.math.BigDecimal;

@RestController
@RequestMapping("filter")
@RequiredArgsConstructor
public class TestFilterController {
    private final ItemService itemService;

    @GetMapping
    private String testFilter() {
        System.out.println("Dupa zbita");
        return "Twoja stara";
    }

    @GetMapping("save")
    private Item SaveTempItem() {
        Item item = new Item();
        item.setName("Cyc");
        item.setPrice(new BigDecimal("21.37"));
        return itemService.save(item);
    }

}
