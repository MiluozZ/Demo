package com.miluo.tacocloud.entity;

import lombok.Data;

import java.util.List;

/**
 * @className: Taco
 * @description:
 * @author: Miluo
 * @date: 2021/3/26
 **/
@Data
public class Taco {
    private String name;
    private List<String> ingredients;
}
