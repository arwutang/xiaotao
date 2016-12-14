package com.xiaotaot.controller;

import com.xiaotaot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {
    @Autowired
    private OrderService orderService;

    public HelloController() {
        System.out.println("HelloController");
    }

    @RequestMapping("/hello")
    public String sayHello() {
        return "welcome";
    }
}
