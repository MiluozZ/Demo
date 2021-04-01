package com.miluo.tacocloud.entity;

import lombok.Data;

/**
 * @className: Order
 * @description:
 * @author: Miluo
 * @date: 2021/4/1
 **/
@Data
public class Order {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
}
