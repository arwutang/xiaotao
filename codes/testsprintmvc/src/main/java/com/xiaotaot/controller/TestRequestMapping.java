package com.xiaotaot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/request_mapping")
public class TestRequestMapping {
    @RequestMapping("/sub_page")
    public String listAllOrders() {
        return "welcome";
    }

    @RequestMapping(value="/test_method/get", method=RequestMethod.GET)
    public String testPost() {
        return "welcome";
    }

    @RequestMapping(value="/test_param", params={"order_id"})
    public String testParams() {
        return "welcome";
    }

    @RequestMapping(value="/test_request_param")
    public String testRequestParams(@RequestParam(value = "query", required = false)String query) {
        System.out.println("Query = " + query);
        return "welcome";
    }

    @RequestMapping(value="/test_cookie")
    public String testCookie(@CookieValue(value = "JSESSIONID") String sessionId) {
        System.out.println("sessionId = " + sessionId);
        return "welcome";
    }
}
