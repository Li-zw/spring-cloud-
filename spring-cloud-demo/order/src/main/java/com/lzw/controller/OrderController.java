package com.lzw.controller;

import com.lzw.config.MyRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author LZW
 * @Description
 * @Date 2022-04-14 21:53
 * @Version 1.0
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private MyRestTemplate myRestTemplate;

    @RequestMapping("add")
    public String add() {
        System.out.println("下单成功!");
        String message = myRestTemplate.getForObject("http://localhost:8081/stock/reduce", String.class);
        return "Hello World!" + "\n" + message;
    }


}
