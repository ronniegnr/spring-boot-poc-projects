package com.bd.ronnie.pocspringbootjwt.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class PocController {

    @RequestMapping("test")
    public String test() {
        return "hello world";
    }
}
