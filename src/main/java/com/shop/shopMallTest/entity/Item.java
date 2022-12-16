package com.shop.shopMallTest.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="item_table")
public class Item {

    @Id
    @Column(name ="item_id")
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Integer id;//상품의 번호(기본키)

    @Column(nullable = false, length = 50)
    private String itemName; //상품의 이름


    @Column(nullable =  false)
    private  int price; //상품의 가격

    @Column(nullable = false)
    private int stockCount; //재고수량

}
