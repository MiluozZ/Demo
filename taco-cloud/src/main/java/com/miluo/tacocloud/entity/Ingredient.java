package com.miluo.tacocloud.entity;

import lombok.*;
import org.springframework.stereotype.Component;


/**
 * @className: Ingredient
 * @description:
 * @author: Miluo
 * @date: 2021/3/19
 **/
@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;
    public static enum Type{
        WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE
    }
}
