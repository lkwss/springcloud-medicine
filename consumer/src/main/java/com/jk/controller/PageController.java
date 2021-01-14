package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {
    @RequestMapping("toindex")
    public String toindex(){
        return "index";
    }
    @RequestMapping("tometting")
    public String tometting(){
        return "metting";
    }

    @RequestMapping("tologins")
    public String tologins(){
        return "logins";
    }
}
