package com.miluo.tacocloud.controller;

import com.miluo.tacocloud.entity.Ingredient;
import com.miluo.tacocloud.entity.Taco;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @className: DesignTacoController
 * @description:
 * @author: Miluo
 * @date: 2021/3/19
 **/
@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {
    @GetMapping
    public String showDesignForm(Model model){
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient("FLTO","Flour Tortilla", Ingredient.Type.WRAP),
                new Ingredient("COTO","Corn Tortilla", Ingredient.Type.WRAP),
                new Ingredient("GRBF","Ground Beef", Ingredient.Type.WRAP),
                new Ingredient("CARN","Carnitas", Ingredient.Type.WRAP),
                new Ingredient("TMTO","Diced Tomatoes", Ingredient.Type.VEGGIES),
                new Ingredient("LETC","Lettuce", Ingredient.Type.VEGGIES),
                new Ingredient("CHED","Cheddar", Ingredient.Type.CHEESE),
                new Ingredient("JACK","Monterrey Jack", Ingredient.Type.CHEESE),
                new Ingredient("SLSA","Salsa", Ingredient.Type.SAUCE),
                new Ingredient("SRCR","Sour Cream", Ingredient.Type.SAUCE)
        );

        Ingredient.Type[] values = Ingredient.Type.values();
        for(Ingredient.Type type : values){
            model.addAttribute(type.toString().toLowerCase(),
                    filterByType(ingredients,type));
        }
        model.addAttribute("design",new Taco());
        return "design";
    }

    private List<Ingredient> filterByType(List<Ingredient> ingredients,Ingredient.Type type){
        return ingredients.stream().
                filter(x-> x.getType().equals(type)).
                collect(Collectors.toList());
    }

    @PostMapping
    public String processDesign(Taco taco){
        log.info("Taco Design :" + taco);
        return "redirect:order/current";
    }
}
