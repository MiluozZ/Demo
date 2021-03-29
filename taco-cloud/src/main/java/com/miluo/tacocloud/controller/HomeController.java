package com.miluo.tacocloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @className: HemoController
 * @description:
 * @author: Miluo
 * @date: 2021/3/19
 **/
@Controller
public class HomeController {

    @GetMapping("/")
    public String Home(){
        return "home";
    }
}
