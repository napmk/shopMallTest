package com.shop.shopMallTest.repository;

import com.shop.shopMallTest.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {

    public List<Item> findByItemName(String itemName);//상품 이름으로 조회
}
