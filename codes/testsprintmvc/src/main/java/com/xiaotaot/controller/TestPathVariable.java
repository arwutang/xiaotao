package com.xiaotaot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test_var")
public class TestPathVariable {

    @RequestMapping(value="/test_var_1/{id}")
    public String testVar1(@PathVariable("id")Integer id) {
        System.out.println("Id = " + id);
        return "welcome";
    }

    @RequestMapping(value="/test_var_2/name/{name}/age/{age}")
    public String testVar1(@PathVariable("name")String name, @PathVariable("age")Integer age) {
        System.out.println("Nanme = " + name + ", Age = " + age);
        return "welcome";
    }
}
