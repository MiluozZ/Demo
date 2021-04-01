package com.miluo.tacocloud.controller;

import com.miluo.tacocloud.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: OrderController
 * @description:
 * @author: Miluo
 * @date: 2021/4/1
 **/
@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/current")
    public String orderForm(Model model){
        model.addAttribute("order",new Order());
        return "orderForm";
    }

    @PostMapping
    public String processOrder(Order order){
        log.info("Order submit:" + order);
        return "redirect:/";
    }
}
