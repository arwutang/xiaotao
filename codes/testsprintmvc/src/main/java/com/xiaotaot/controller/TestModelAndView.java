package com.xiaotaot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;
import java.util.logging.Logger;


@Controller
@RequestMapping("/model_view")
public class TestModelAndView {
    private static final Logger LOGGER = Logger.getLogger(TestModelAndView.class.getName());

    @RequestMapping("/test1")
    public ModelAndView testModelAndView() {
        String viewName = "viewtest";

        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("time", new Date());
        modelAndView.addObject("username", "xiaotaot");

        return modelAndView;
    }

    @RequestMapping("/test_map")
    public String testMap(Map<String, Object> map) {
        map.put("username", "xiaotaot1");

        return "viewtest";
    }
}
