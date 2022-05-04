package com.lzw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author LZW
 * @Description
 * @Date 2022-04-14 21:55
 * @Version 1.0
 */
@RestController
@RequestMapping("stock")
public class StockController {

    @RequestMapping("reduce")
    public String reduce() {
        System.out.println("扣减库存");
        return "扣减库存！";
    }
}
