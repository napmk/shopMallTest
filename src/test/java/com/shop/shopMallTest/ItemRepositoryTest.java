package com.shop.shopMallTest;

import com.shop.shopMallTest.entity.Item;
import com.shop.shopMallTest.repository.ItemRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ItemRepositoryTest {
    @Autowired
    ItemRepository itemRepository;

//    @Test
//    @DisplayName("상품정보 저장 테스트")
//    public void createItemTest(){
//
//        Item item = new Item();
//        item.setItemName("치즈");
//        item.setPrice(12000);
//        item.setStockCount(50);
//
//       Item savedItem = itemRepository.save(item);
//
//    }

    @Test
    @DisplayName("상품조회테스트")
    public void findByNameTest(){
    List<Item> items = itemRepository.findByItemName("치즈");

    for(Item item : items){
        System.out.println(item.toString());
    }

    }

}
