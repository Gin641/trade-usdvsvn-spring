package com.gin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Gin {
    @PostMapping ("/gin")
    public ModelAndView gin(@RequestParam double usd){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("vn",usd * 22000);
        return modelAndView;
    }
}
