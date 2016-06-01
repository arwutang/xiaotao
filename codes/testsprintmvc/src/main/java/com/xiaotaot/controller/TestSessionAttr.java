package com.xiaotaot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Map;

@Controller
@SessionAttributes({"username"})
@RequestMapping("/session_attr")
public class TestSessionAttr {

    @RequestMapping("/test_session")
    public String testMap(Map<String, Object> map) {
        map.put("username", "xiaotaot");

        return "viewtest";
    }
}
