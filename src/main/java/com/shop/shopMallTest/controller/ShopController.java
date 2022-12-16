package com.shop.shopMallTest.controller;

import com.shop.shopMallTest.entity.Item;
import com.shop.shopMallTest.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/shop")//자동으로 붙음
public class ShopController {

    @Autowired
    ItemRepository itemRepository;

    @RequestMapping (value = "/item")// value="/shop/item"
    public String item(Model model){
        List<Item> itemList = itemRepository.findByItemName("치즈");

        Item item = itemList.get(0);// 첫번째 김치 상품 객체 추춘

        model.addAttribute("item",item);

        return "itemlist";
    }
}
